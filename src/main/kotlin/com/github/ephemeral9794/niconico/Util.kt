package com.github.ephemeral9794.niconico

fun escapeUnicode(data: String) : String {
	val replace = Regex("\\\\[Uu]([0-9A-Fa-f]{4})").replace(data) { result ->
		val code = result.groups[0]!!.value.substring(2..5).toInt(16)
		code.toChar().toString()
	}
	return Regex("\\\\/").replace(replace, "/")
}
