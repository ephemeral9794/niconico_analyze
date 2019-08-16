package com.github.ephemeral9794.niconico.accessor

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.result.*

class NicoDMCAccessor {
    private val DOMAIN = ""

    fun connect() {
        val (req, res, result) = Fuel.get(DOMAIN).responseString()
        when (result) {
            is Result.Success -> {

            }
            is Result.Failure -> {

            }
        }
    }
}