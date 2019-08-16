package com.github.ephemeral9794.niconico.accessor

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

object NiconicoCrawler {
    private val DOMAIN = "https://www.nicovideo.jp/watch/"

    fun get(id: String): String {
        val document = Jsoup.connect(DOMAIN + id).get()
        val element = document.getElementById("js-initial-watch-data")
        val data = element.attr("data-api-data")
        return data
    }
}