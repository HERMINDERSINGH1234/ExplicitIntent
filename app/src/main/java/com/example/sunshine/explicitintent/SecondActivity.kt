package com.example.sunshine.explicitintent

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.content_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)


        val bundle:Bundle=intent.extras
        val id=bundle.get("id_value")
        val language=bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+" "+language,Toast.LENGTH_LONG).show()

        button2.setOnClickListener(){
             intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


        //fab.setOnClickListener { view ->
          //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            //    .setAction("Action", null).show()
        //}
    }

}
