package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun speak(): String

    fun describe(): String {
        return "On $date the mood was: ${speak()}"
    }
}