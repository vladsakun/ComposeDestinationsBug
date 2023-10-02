package com.playground.composedestinationsbug

data class ListTracking(
    val test: String = "test",
) {

    enum class Triggered(val value: String) {
        JUST("JUST"),
        DO("DO"),
        IT("IT");
    }
}