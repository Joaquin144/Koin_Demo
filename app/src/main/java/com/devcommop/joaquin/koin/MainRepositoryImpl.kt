package com.devcommop.joaquin.koin

class MainRepositoryImpl(
    private val api: MyApi
): MainRepository {
    override fun doNetworkCall() {
        api.callApi()
    }
}