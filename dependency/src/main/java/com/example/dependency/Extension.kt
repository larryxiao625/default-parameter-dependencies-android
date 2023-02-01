package com.example.dependency

import kotlin.reflect.KClass

inline fun <reified VM : DefaultParameter> delegation(): DefaultParameterLazy<VM> {
    return DefaultParameterLazy<VM>(VM::class)
}

class DefaultParameterLazy<VM : DefaultParameter>(private val classType: KClass<VM>) : Lazy<VM> {
    private var cached: VM? = null
    override val value: VM
        get() {
            cached = classType.java.newInstance()
            return cached as VM
        }

    override fun isInitialized(): Boolean {
        return cached != null
    }
}