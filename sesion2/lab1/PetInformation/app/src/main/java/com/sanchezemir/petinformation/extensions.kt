package com.sanchezemir.petinformation

import android.content.Context
import android.view.View
import android.widget.Toast

//Funcion de extencion Toast
fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, message, duration).show()

//Funcion Infix
infix fun View.click(click: () -> Unit) = setOnClickListener { click() }