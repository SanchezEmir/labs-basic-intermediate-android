package com.sanchezemir.listcontact.entity

import java.io.Serializable

data class Person(
    val fullName: String,
    val cargo: String,
    val email: String
): Serializable