package com.sanchezemir.minmaxage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProcesar = findViewById<Button>(R.id.btnProcesar)
        val edtAge = findViewById<EditText>(R.id.edtEdad)
        val txvResult = findViewById<TextView>(R.id.txvResultado)

        btnProcesar.setOnClickListener {
            val age = edtAge.text.toString().toInt()
            val result = if (age >= 18) "Mayor de edad" else "Menor de edad"
            txvResult.setText(result)
        }

    }



}