package com.github.ephemeral9794.niconico.accessor

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.cookies.ConstantCookiesStorage
import io.ktor.client.features.cookies.HttpCookies
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.port
import io.ktor.client.request.url
import io.ktor.http.Cookie
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.runBlocking
import org.jsoup.Jsoup
import org.slf4j.LoggerFactory
import java.lang.Exception
import java.net.SocketTimeoutException

object NiconicoCrawler {
	private val DOMAIN = "https://www.nicovideo.jp/watch/"
	private val log = LoggerFactory.getLogger(this.javaClass)

	fun get(id: String, cookie: Cookie): Pair<String, String> {
		val client = HttpClient(Apache) {
			engine {
				socketTimeout = 30000
			}
			install(HttpCookies) {
				storage = ConstantCookiesStorage(cookie)
			}
		}
		val response = runBlocking {
			val response = client.get<String> {
				url(DOMAIN + id)
				port = 443
				headers {
					append("Accept", "*/*")
					append("Accept-Language", "ja")
				}
			}
			client.close()
			response
		}
		val document = Jsoup.parse(response)
		val element = document.getElementById("js-initial-watch-data")
		val data = element.attr("data-api-data")
		val env = element.attr("data-environment")
		return Pair(data, env)
	}
}