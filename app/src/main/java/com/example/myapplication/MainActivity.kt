package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val news = findViewById<Button>(R.id.news)
         val katalog = findViewById<Button>(R.id.katalog)
         val myBooks = findViewById<Button>(R.id.mubooks)
         val sett = findViewById<Button>(R.id.sett)

        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        news.setOnClickListener(){
            intent.putExtra("n", 0)
            startActivity(intent)
        }
        katalog.setOnClickListener(){
            intent.putExtra("n", 1)
            startActivity(intent)
        }
        myBooks.setOnClickListener(){
            intent.putExtra("n",2)
            startActivity(intent)
        }
        sett.setOnClickListener(){
            intent.putExtra("n", 3)
            startActivity(intent)
        }

    }
}