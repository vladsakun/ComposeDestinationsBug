package com.playground.composedestinationsbug

data class DetailsTracking(
    val test: String = "test",
) {

    enum class Triggered(val value: String) {
        TEST1("Screen2TrackingJUST"),
        ALOHA("Screen2TrackingDO"),
        BANANA("Screen2TrackingIT");
    }
}