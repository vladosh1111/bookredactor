package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import org.json.JSONArray

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val num = intent.extras?.getInt("n") ?: -1

        val bott1 = findViewById<Button>(R.id.addBotton)
        val tex1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)
        val text3 = findViewById<TextView>(R.id.text3)
        val textin2 = findViewById<EditText>(R.id.autorr)
        val textin3 = findViewById<EditText>(R.id.pages)

        val textin = findViewById<EditText>(R.id.namee)

        val tex = findViewById<ListView>(R.id.dde)
        val arr = mutableListOf<String>()

        if (num == 1) {
            textin.visibility = View.GONE
            tex.visibility = View.GONE
            tex1.visibility = View.GONE
            text2.visibility = View.GONE
            text3.visibility = View.GONE
            bott1.visibility = View.GONE
            textin2.visibility = View.GONE
            textin3.visibility = View.GONE



        } else if (num == 2) {


            bott1.setOnClickListener() {
                val BookParam = bookParametrs(
                    name = textin.text.toString(),
                    autor = textin2.text.toString(),
                    pagenum = textin3.text.toString()
                )
                arr.add(BookParam.toString())
                val adapte = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
                tex.adapter = adapte
            }


        } else if (num == 0) {
            textin.visibility = View.GONE
            tex.visibility = View.GONE
            tex1.visibility = View.GONE
            text2.visibility = View.GONE
            text3.visibility = View.GONE
            bott1.visibility = View.GONE
            textin2.visibility = View.GONE
            textin3.visibility = View.GONE



        } else if (num == 3) {
            textin.visibility = View.GONE
            tex.visibility = View.GONE
            tex1.visibility = View.GONE
            text2.visibility = View.GONE
            text3.visibility = View.GONE
            bott1.visibility = View.GONE
            textin2.visibility = View.GONE
            textin3.visibility = View.GONE

        }
        val sharedpref = getSharedPreferences("mybooksave", MODE_PRIVATE)
        fun save(){

        }
        fun get(){



        }


    }}



