package com.example.default_parameter_dependencies

import com.example.dependency.delegation

object DefaultParameterInvoke : DefaultParameterInvokeInterface {

    private val impl: DefaultParameterImpl by delegation()


    fun invokeDefaultParameter() {
        impl.defaultParameterTest("aaaa", defaultParameter1 = "aaaaa", defaultParameter4 = { })
    }
}