package com.devcommop.joaquin.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

class MainActivity() : AppCompatActivity(), AndroidScopeComponent {

    override val scope: Scope by activityScope()
    //activityScope --> as soon as activity is destoryed this will be garbage collected
    //activityRetainedScope --> as soon as ViewModel is destoryed this will be garbage collected
    private val hello by inject<String>()

    //by --> jab kaam padega tabhio instance create hoga like lazy
    private val viewModel by viewModel<MainViewModel>()//by this line app module se viewModel ki dependency automatically uth kar aa jayegi
    private val api by inject<MyApi>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(hello)
        //Toast.makeText(this,"Main Activity",Toast.LENGTH_SHORT).show()
        viewModel.getUserData(this)
    }


}