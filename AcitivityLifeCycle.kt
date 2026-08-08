package com.example.activitylifecycle24b81a05u5

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            this,
            "OnCreate Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnCreate Calling")
        enableEdgeToEdge()

        setContent {
            Text("Likith")
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            this,
            "OnStart Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnStart Calling")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this,
            "OnResume Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnResume Calling")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            this,
            "OnPause Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnPause Calling")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this,
            "OnStop Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnStop Calling")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(
            this,
            "OnRestart Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnRestart Calling")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(
            this,
            "OnDestroy Calling",
            Toast.LENGTH_LONG
        ).show()
        Log.d("Activity LifeCycle","OnDestroy Calling")
    }
}
