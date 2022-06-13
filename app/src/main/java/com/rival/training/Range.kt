package com.rival.training

fun main() {

    val numberRange = 1..100 step 5
    numberRange.forEach { nilai ->
        println(nilai)
    }

    //step untuk mengurangi nilai atau lompatan

//    println(numberRange)
//    println(numberRange.count())
//    println(numberRange.contains(50))
//    println(numberRange.first)
//    println(numberRange.step)

    val numberRange2 = 100 downTo 1

    //downTo digunakan untuk mengurangi nilai

    numberRange2.forEach {
        println(it)
    }

}