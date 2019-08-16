package com.github.ephemeral9794.niconico

import com.github.ephemeral9794.niconico.accessor.NiconicoCrawler
import org.json.JSONObject

fun main(args: Array<String>) {
    val res = NiconicoCrawler.get("1565316367")
    val json = Util.escapeUnicode(res)
    println(json)

    val obj = JSONObject(json)
    val dmcInfo = obj.getJSONObject("video").getJSONObject("dmcInfo")
    println(dmcInfo)
}