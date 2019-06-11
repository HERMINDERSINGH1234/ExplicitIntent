package com.example.sunshine.explicitintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//add this first then
    val id:Int=10
    val language:String="Kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // then this will be added to this then after

        button.setOnClickListener(){
            intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language_value",language)
            startActivity(intent)
        }
    }
}
