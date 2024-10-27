package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d( "****TAG", "onCreate" )
        Toast.makeText(this, "oncreate", Toast.LENGTH_LONG).show()
        Toast.makeText(this, R.string.app_name, Toast.LENGTH_LONG).show()
    }
    //Do  On Pause,  On Stop, On Start
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show()
        Log.d("****TAG ","onPause")
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "On Stop ", Toast.LENGTH_SHORT).show()
        Log.d("****TAG ","onStop")
    }

    override fun onStart() {
        super.onStart()
        //Fazer o Toast de Strings.xml

        // After TOast pelas Strings do XML  getString(R.string.app_name
        Toast.makeText(this, "On Start ", Toast.LENGTH_SHORT).show()
        Log.d("****TAG ","onStart")
    }

   /*
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show()
    }*/
}