package com.check.gradle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.check.gradle.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    fun openFunction() {
        Log.d("openFunction ","called ")
    }
}

fun extensionFunction() {
    Log.d("extensionFunction ","called ")

}