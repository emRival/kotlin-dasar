package com.rival.training

fun main() {



    val grade = 'A'

    when (grade) {
        'A' -> println("Excellent")
        'B' -> println("Good")
        'C' -> println("Fair")
        'D' -> println("Poor")
        'F' -> println("Fail")
        else -> println("Try again")
    }

    when (grade) {
        'A', 'B', 'C' -> println("Good")
        'D', 'F' -> println("Poor")
        else -> println("Try again")
    }

    val nilai = 60..100
    val person = 60

    when (person) {
        in nilai -> println("Kamu bisa lulus")
        !in nilai -> println("Kamu tidak bisa lulus")
    }
    // untuk cek ada engga di dalam nilai
    // in = dalam, !in = tidak dalam

    when (person) {
        is Int -> println("Nilai ini adalah integer")
        !is Int -> println("Nilai ini adalah integer")
    }
    // is adalah


    val nilai2 = 60
  when{
      nilai2 % 2 == 0 -> println("Nilai ini adalah genap")
      nilai2 % 2 != 0 -> println("Nilai ini adalah ganjil")
  }


}