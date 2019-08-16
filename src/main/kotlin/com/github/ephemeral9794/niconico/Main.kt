package com.github.ephemeral9794.niconico

import com.github.ephemeral9794.niconico.accessor.NiconicoCrawler
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val res = NiconicoCrawler.get("1565316367")
    //println(res)
    val json = Util.escapeUnicode(res)
    println(json)
    //Files.write(Paths.get("./result.json"), json.toByteArray(Charset.defaultCharset()))
}