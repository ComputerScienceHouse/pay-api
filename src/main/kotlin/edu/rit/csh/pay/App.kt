package edu.rit.csh.pay

import spark.kotlin.ignite
import spark.kotlin.Http

import edu.rit.csh.pay.controllers.BalancesController

fun main(args: Array<String>) {
    val http: Http = ignite()

    BalancesController.registerRoutes(http)
}
