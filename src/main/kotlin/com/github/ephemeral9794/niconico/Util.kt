package com.github.ephemeral9794.niconico

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import java.lang.StringBuilder
import java.net.URLEncoder

class Util {
    companion object {
        fun escapeUnicode(data: String) : String {
            val replace = Regex("\\\\[Uu]([0-9A-Fa-f]{4})").replace(data) { result ->
                val code = result.groups[0]!!.value.substring(2..5).toInt(16)
                code.toChar().toString()
            }
            return Regex("\\\\/").replace(replace, "/")
        }

        private val client = HttpClient(Apache) {
            followRedirects = false
        }
        val Client
            get() = client
    }
}

fun String.encodeURL() :String = buildString {
    this.append(URLEncoder.encode(this@encodeURL, Charsets.UTF_8))
}
fun buildURLEncode(vararg elements: Pair<String, String?>): String {
    return URLEncodeBuilder().apply {
        if (elements.isNotEmpty()) {
            elements.forEach { this.append(it) }
        }
    }.encode()
}
fun buildURLEncode(builder: URLEncodeBuilder.() -> Unit) : String = URLEncodeBuilder().apply(builder).encode()
class URLEncodeBuilder {
    private val list = mutableListOf<Pair<String, String?>>()

    fun append(key: String, value: String?) = apply {
        list.add(key to value)
    }
    fun append(pair: Pair<String, String?>) = apply {
        list.add(pair)
    }
    fun append(vararg elements: Pair<String, String?>) = apply {
        if (elements.isNotEmpty()) {
            list.addAll(elements)
        }
    }
    fun appendAll(elements: Array<Pair<String, String?>>)  = apply {
        if (elements.isNotEmpty()) {
            list.addAll(elements)
        }
    }

    fun encode(): String = StringBuilder().apply {
        list.joinTo(this, "&") {
            val key = it.first.encodeURL()
            if (it.second == null) {
                key
            }
            else {
                val value = it.second.toString().encodeURL()
                "$key=$value"
            }
        }
    }.toString()
}
