package com.sanchezemir.petinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    val DOG = "DOG"
    val CAT = "CAT"
    val RABBIT = "RABBIT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<Button>(R.id.btnSend)

        btnSend click {
            sendData()
        }

    }

    fun sendData() {

        val edtName = findViewById<EditText>(R.id.edtName)
        val edtAge = findViewById<EditText>(R.id.edtAge)
        val rbDog = findViewById<RadioButton>(R.id.rbDog)
        val rbCat = findViewById<RadioButton>(R.id.rbCat)
        val rbRabbit = findViewById<RadioButton>(R.id.rbRabbit)
        val chkVaccine1 = findViewById<CheckBox>(R.id.chkVaccine1)
        val chkVaccine2 = findViewById<CheckBox>(R.id.chkVaccine2)
        val chkVaccine3 = findViewById<CheckBox>(R.id.chkVaccine3)
        val chkVaccine4 = findViewById<CheckBox>(R.id.chkVaccine4)
        val chkVaccine5 = findViewById<CheckBox>(R.id.chkVaccine5)

        val name = edtName.text.toString()
        val age = edtAge.text.toString()
        val type = when {
            rbDog.isChecked -> DOG
            rbCat.isChecked -> CAT
            rbRabbit.isChecked -> RABBIT
            else -> ""
        }

        if (name.isEmpty()) {
            showToast("Ingresa un nombre",2)
            return
        }

        if (age.isEmpty()) {
            showToast("Ingresa una edad",2)
            return
        }

        val vaccines = mutableListOf<String>()
        if (chkVaccine1.isChecked) vaccines.add(chkVaccine1.text.toString())
        if (chkVaccine2.isChecked) vaccines.add(chkVaccine2.text.toString())
        if (chkVaccine3.isChecked) vaccines.add(chkVaccine3.text.toString())
        if (chkVaccine4.isChecked) vaccines.add(chkVaccine4.text.toString())
        if (chkVaccine5.isChecked) vaccines.add(chkVaccine5.text.toString())

        val cantidadVacunas = vaccines.size

        val bundle = Bundle().apply {
            putString("KEY_NAME", name)
            putString("KEY_AGE", age)
            putString("KEY_TYPE", type)
            putInt("KEY_CANTIDAD", cantidadVacunas)
        }

        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtras(bundle)
        }
        startActivity(intent)

    }



}