package com.example.dependency

abstract class DefaultParameter {
    fun <T> defaultParameterTest(
        normal: T,
        defaultParameter1: String = "",
        defaultParameter2: ((Throwable) -> Unit)? = null,
        defaultParameter3: (() -> Unit)? = null,
        defaultParameter4: ((T) -> Unit)? = null
    ) {

    }
}