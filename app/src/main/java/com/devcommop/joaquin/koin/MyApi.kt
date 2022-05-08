package com.devcommop.joaquin.koin

import retrofit2.http.GET

interface MyApi {
    @GET("my/endpoint")
    fun callApi()
}