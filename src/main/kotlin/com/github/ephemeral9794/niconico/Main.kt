package com.github.ephemeral9794.niconico

import com.eclipsesource.json.Json
import com.github.ephemeral9794.niconico.accessor.NiconicoContext
import com.github.ephemeral9794.niconico.accessor.NiconicoCrawler
import com.github.ephemeral9794.niconico.entity.DmcSessionRequest
import com.github.ephemeral9794.niconico.entity.NicoWatchData
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val account = Json.parse(Files.readString(Paths.get("account.json"))).asObject()
    val context = NiconicoContext(account.getString("mail", ""), account.getString("password", ""))
    val status = context.signIn()
    println("${status}, ${context.Authority}")

    val (data, env) = NiconicoCrawler.get("1567052343", context.Cookie)
    val watchData = escapeUnicode(data)
	val environment = escapeUnicode(env)
	Files.writeString(Paths.get("./data-api-data.json"), watchData)
	Files.writeString(Paths.get("./data-environment.json"), environment)

	val moshi = Moshi.Builder()
		.add(KotlinJsonAdapterFactory())
		.build()
	val json = moshi.adapter(NicoWatchData::class.java).fromJson(watchData)
	println(json)

    context.signOut()
}