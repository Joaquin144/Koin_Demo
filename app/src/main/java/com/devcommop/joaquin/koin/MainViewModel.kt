package com.devcommop.joaquin.koin

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {
    fun getUserData(context: Context){
        Toast.makeText(context,"Kuch toh hua hai",Toast.LENGTH_SHORT).show()
        println("Kuch toh hua hai")
        Log.d("##","user data is 100% matched")
    }
}