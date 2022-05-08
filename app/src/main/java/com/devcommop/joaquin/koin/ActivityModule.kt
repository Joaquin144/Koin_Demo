package com.devcommop.joaquin.koin

import org.koin.dsl.module

val activityModule = module{
    scope<MainActivity>{
        scoped{ "Hello" }
    }
}