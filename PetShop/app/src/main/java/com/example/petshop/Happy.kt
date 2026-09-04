package com.example.petshop

class Happy(instanceDate: String): Mood(instanceDate) {
    override fun speak(): String {
        return "Genuinely happy"
    }
}