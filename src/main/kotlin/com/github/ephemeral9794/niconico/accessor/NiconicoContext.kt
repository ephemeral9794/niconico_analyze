package com.github.ephemeral9794.niconico.accessor

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.cookies.ConstantCookiesStorage
import io.ktor.client.features.cookies.HttpCookies
import io.ktor.client.request.headers
import io.ktor.client.request.port
import io.ktor.client.request.post
import io.ktor.client.request.url
import io.ktor.client.response.HttpResponse
import io.ktor.content.TextContent
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory

class NiconicoContext (mail: String, password: String) {
	data class AuthInfo (
		val mail: String,
		val password: String
	)
	enum class SignInStatus {
		Success,
		Failed,
		ServiceUnavailable,
		TwoFactorAuthRequired
	}
	enum class AccountAuthority {
		NotSignedIn,
		Normal,
		Premium,
	}

	private val LOGIN = "https://account.nicovideo.jp/api/v1/login?site=niconico"
	private val LOGOUT = "https://secure.nicovideo.jp/secure/logout"

	private val log = LoggerFactory.getLogger(this.javaClass)
	private val auth : AuthInfo
	private var authority: AccountAuthority
	val Authority: AccountAuthority
		get() = authority

	private lateinit var cookie: Cookie
	val Cookie: Cookie
		get() = cookie

	init {
		auth = AuthInfo(mail, password)
		authority = AccountAuthority.NotSignedIn
	}

	fun signIn(): SignInStatus {
		val client = HttpClient(Apache) {
			followRedirects = false
		}
		val response = runBlocking {
			val param = Parameters.build {
				append("mail_tel", auth.mail)
				append("password", auth.password)
			}
			client.post<HttpResponse> {
				url(LOGIN)
				port = 443
				headers {
					//append("Content-Type", "application/x-www-form-urlencoded")
					append("Accept", "*/*")
					append("Accept-Language", "ja")
				}
				body = TextContent(param.formUrlEncode(), ContentType.Application.FormUrlEncoded)
			}
		}
		client.close()

		val cookies = response.setCookie()
		cookies.forEach { println(it) }
		cookie = cookies[1]

		val auth = (response.headers["X-Nico-Account-Authentication"] ?: "0").toInt()
		authority = when (auth) {
			1 -> AccountAuthority.Normal
			2 -> AccountAuthority.Premium
			else -> AccountAuthority.NotSignedIn
		}
		if (auth != 0) {
			return SignInStatus.Success
		} else {
			return SignInStatus.Failed
		}
	}

	fun signOut() {
		val client = HttpClient(Apache) {
			install(HttpCookies) {
				storage = ConstantCookiesStorage(cookie)
			}
		}
		runBlocking {
			client.post<HttpResponse> {
				url(LOGOUT)
				port = 443
				headers {
					append("Accept", "*/*")
					append("Accept-Language", "ja")
				}
			}
			client.close()
		}
	}
}