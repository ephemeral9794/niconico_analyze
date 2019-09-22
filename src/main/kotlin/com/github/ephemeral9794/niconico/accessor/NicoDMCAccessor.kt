package com.github.ephemeral9794.niconico.accessor

import com.github.ephemeral9794.niconico.Util
import io.ktor.client.request.get
import kotlinx.coroutines.runBlocking


class NicoDMCAccessor {
    private val scheme = "https"
    private val host = ""
    private val port = 443

    fun connect() {
        val client = Util.Client
        val response = runBlocking {
            client.get<String>(scheme = scheme, host = host, port = port)
        }
        println(response)
    }
}