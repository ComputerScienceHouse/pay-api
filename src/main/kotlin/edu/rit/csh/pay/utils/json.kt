package edu.rit.csh.pay.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder

object json {
    val gson: Gson = GsonBuilder().setPrettyPrinting().create()

    fun toJson(obj: Any): String {
        return gson.toJson(obj)
    }
}