package edu.rit.csh.pay.models

import com.google.gson.annotations.SerializedName

enum class Currencies(val id: String) {
    @SerializedName("swag")
    SWAG_DOLLARS("swag") {
        override fun toString() = "Swag Dollars"
    },

    @SerializedName("drink")
    DRINK_CREDITS("drink") {
        override fun toString() = "Drink Credits"
    }
}
