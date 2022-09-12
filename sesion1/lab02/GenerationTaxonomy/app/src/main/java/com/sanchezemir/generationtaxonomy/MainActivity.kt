package com.sanchezemir.generationtaxonomy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtDate = findViewById<EditText>(R.id.edtDate)
        val btnVerificar = findViewById<TextView>(R.id.btnVerificar)
        val txvGeneracion = findViewById<TextView>(R.id.txvGeneracion)
        val txvNroPoblacion = findViewById<TextView>(R.id.txvNroPoblacion)
        val txvRasgoCaracteristico = findViewById<TextView>(R.id.txvRasgoCaracteristico)

        btnVerificar.setOnClickListener {

            val date = edtDate.text.toString().toInt()

            if (date in 1930..1948) {
                txvGeneracion.text = "Generación: Silent Generation"
                txvNroPoblacion.text = "Nro. Población: 6.300.000"
                txvRasgoCaracteristico.text = "Rasgo Característico: Austeridad"
                txvGeneracion.visibility = TextView.VISIBLE
                txvNroPoblacion.visibility = TextView.VISIBLE
                txvRasgoCaracteristico.visibility = TextView.VISIBLE
            } else if (date in 1949..1968) {
                txvGeneracion.text = "Generación Baby Boom"
                txvNroPoblacion.text = "Nro. Población: 12.200.000"
                txvRasgoCaracteristico.text = "Rasgo Característico: Ambición"
                txvGeneracion.visibility = TextView.VISIBLE
                txvNroPoblacion.visibility = TextView.VISIBLE
                txvRasgoCaracteristico.visibility = TextView.VISIBLE
            } else if (date in 1969..1980) {
                txvGeneracion.text = "Generación X"
                txvNroPoblacion.text = "Nro. Población: 9.300.000"
                txvRasgoCaracteristico.text = "Rasgo Característico: Obsesión por el éxito"
                txvGeneracion.visibility = TextView.VISIBLE
                txvNroPoblacion.visibility = TextView.VISIBLE
                txvRasgoCaracteristico.visibility = TextView.VISIBLE
            } else if (date in 1981..1993) {
                txvGeneracion.text = "Generación Y"
                txvNroPoblacion.text = "Nro. Población: 7.200.000"
                txvRasgoCaracteristico.text = "Rasgo Característico: Frustación"
                txvGeneracion.visibility = TextView.VISIBLE
                txvNroPoblacion.visibility = TextView.VISIBLE
                txvRasgoCaracteristico.visibility = TextView.VISIBLE
            } else if (date in 1994..2010) {
                txvGeneracion.text = "Generación Z"
                txvNroPoblacion.text = "Nro. Población: 7.800.000"
                txvRasgoCaracteristico.text = "Rasgo Característico: Irreverencia"
                txvGeneracion.visibility = TextView.VISIBLE
                txvNroPoblacion.visibility = TextView.VISIBLE
                txvRasgoCaracteristico.visibility = TextView.VISIBLE
            } else {
                txvGeneracion.text = "No se encuentra en ninguna generación"
                txvNroPoblacion.text = "Nro. Población: 0"
                txvRasgoCaracteristico.text = "Rasgo Característico: No tiene"
                txvGeneracion.visibility = TextView.VISIBLE
                txvNroPoblacion.visibility = TextView.VISIBLE
                txvRasgoCaracteristico.visibility = TextView.VISIBLE
            }

        }

    }
}