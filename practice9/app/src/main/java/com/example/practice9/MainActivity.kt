package com.example.practice9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun main(){
        val txt1 =15;
        val txt2 =10;
        println("Your sum is:" + txt1+txt2 )
    }
}