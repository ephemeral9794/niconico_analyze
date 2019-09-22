package com.github.ephemeral9794.niconico

import com.github.ephemeral9794.niconico.accessor.NiconicoContext
import com.github.ephemeral9794.niconico.accessor.NiconicoCrawler
import org.json.JSONObject
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val account = JSONObject(Files.readString(Paths.get("account.json")))
    val context = NiconicoContext(account.getString("mail"), account.getString("password"))
    val status = context.signIn()
    //println("${status}, ${context.Authority}")

    /*val res = NiconicoCrawler.get("1567052343")
    val json = Util.escapeUnicode(res)
    println(json)

    val obj = JSONObject(json)
    val dmcInfo = obj.getJSONObject("video").getJSONObject("dmcInfo")
    println(dmcInfo)*/

    context.signOut()
}