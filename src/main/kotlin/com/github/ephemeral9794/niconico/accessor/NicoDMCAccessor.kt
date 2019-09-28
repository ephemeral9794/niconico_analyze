package com.github.ephemeral9794.niconico.accessor

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.cookies.ConstantCookiesStorage
import io.ktor.client.features.cookies.HttpCookies
import io.ktor.client.request.get
import io.ktor.client.response.HttpResponse
import io.ktor.http.Cookie
import kotlinx.coroutines.runBlocking

class NicoDMCAccessor {
    private val scheme = "https"
    private val host = ""
    private val port = 443

    fun connect(cookie: Cookie) {
		val client = HttpClient(Apache) {
			install(HttpCookies) {
				storage = ConstantCookiesStorage(cookie)
			}
		}
		val response = runBlocking {
			val response = client.get<HttpResponse> {

			}
			client.close()
			response
		}
    }
}