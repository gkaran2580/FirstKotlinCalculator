package com.example.kotlifirstproject

class Dice {

    var sides = 6

    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }


}