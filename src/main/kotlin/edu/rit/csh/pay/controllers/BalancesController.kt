package edu.rit.csh.pay.controllers

import spark.kotlin.Http

import edu.rit.csh.pay.models.Currencies
import edu.rit.csh.pay.models.Balance
import edu.rit.csh.pay.utils.json

object BalancesController {
    fun registerRoutes(http: Http) {
        http.get("/balances") {
            val result = arrayOf(
                Balance(currency = Currencies.SWAG_DOLLARS,
                        amount = 10000),
                Balance(currency = Currencies.DRINK_CREDITS,
                        amount = 10)
            )

            json.toJson(result)
        }

        http.get("/balances/:currency") {
            when (request.params("currency")) {
                Currencies.SWAG_DOLLARS.id -> "10000"
                Currencies.DRINK_CREDITS.id -> "10"
                else -> "Not a valid currency"
            }
        }
    }
}
