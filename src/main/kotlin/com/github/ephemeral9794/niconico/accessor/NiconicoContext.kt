package com.github.ephemeral9794.niconico.accessor

import com.github.ephemeral9794.niconico.Util
import io.ktor.client.request.headers
import io.ktor.client.request.port
import io.ktor.client.request.post
import io.ktor.client.request.url
import io.ktor.client.response.HttpResponse
import io.ktor.content.TextContent
import io.ktor.http.*
import kotlinx.coroutines.runBlocking

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

    fun signIn(): Pair<SignInStatus, AccountAuthority> {
        val client = Util.Client
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

        val request = response.call.request
        //println(request.headers)
        //println(response.status)
        //println(response.headers)
        val cookies = response.headers.getAll("Set-Cookie") ?: listOf<String>("", "", "", "")
        cookies.forEach { println(it) }
        cookie = Cookie("Cookie", cookies[1])

        val authstr = response.headers["X-Nico-Account-Authentication"] ?: "0"
        val authentication = authstr.toInt()
        val authority = when (authentication) {
            1 -> AccountAuthority.Normal
            2 -> AccountAuthority.Premium
            else -> AccountAuthority.NotSignedIn
        }
        if (authentication != 0) {
            return Pair(SignInStatus.Success, authority)
        } else {
            return Pair(SignInStatus.Failed, AccountAuthority.NotSignedIn)
        }
    }

    fun signOut() {
        runBlocking {
            val client = Util.Client
            client.post<HttpResponse> {
                url(LOGOUT)
                port = 443
                headers {
                    append("Accept", "*/*")
                    append("Accept-Language", "ja")
                    append("Cookie", cookie.value)
                }
            }
        }
    }
}