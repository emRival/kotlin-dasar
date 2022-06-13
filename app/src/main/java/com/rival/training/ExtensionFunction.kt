package com.rival.training

fun main() {

    val nama = "Rival"
    val result = nama.hello()
    println(result)

    val angka = 100
    println(angka.luas())

}

fun String.hello(): String {
return "Hello $this"
}

fun Int.luas(): String {
    return "Luas persegi panjang adalah ${this * this}"
}