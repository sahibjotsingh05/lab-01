package com.example.petshop

class Sad(instanceDate: String): Mood(instanceDate) {
    override fun speak(): String {
        return "Genuinely sad"
    }
}