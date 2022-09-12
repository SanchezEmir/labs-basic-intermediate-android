package com.sanchezemir.petinformation

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNamePet = findViewById<TextView>(R.id.tvNamePet)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvPet = findViewById<TextView>(R.id.tvPet)
        val tvVaccine = findViewById<TextView>(R.id.tvVaccine)
        val imgBack = findViewById<ImageView>(R.id.imgBack)
        val imgPet = findViewById<ImageView>(R.id.imgPet)

        val bundle = intent.extras

        val name = bundle?.getString("KEY_NAME") ?: "No name"
        val age = bundle?.getString("KEY_AGE") ?: 0
        val type = bundle?.getString("KEY_TYPE") ?: "No type"
        val cantidad = bundle?.getInt("KEY_CANTIDAD") ?: 0

        if (type == "DOG") {
            imgPet.setImageResource(R.drawable.dog)
        } else if (type == "CAT") {
            imgPet.setImageResource(R.drawable.cat)
        } else {
            imgPet.setImageResource(R.drawable.rabbit)
        }

        tvNamePet.text = name
        tvAge.text = age.toString()
        tvPet.text = type.lowercase()
        tvVaccine.text = "$cantidad vacunas"

        imgBack click{
            onBackPressed()
        }

    }



}