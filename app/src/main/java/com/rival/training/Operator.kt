package com.rival.training

fun main() {

    var penjumlahan = 10 + 1000
    val pengurangan = 100 - 10
    val perkalian = 10 * 10
    val pembagian = 100 / 10
    val modulus = 9 % 2 == 0 //untuk menentukan bilangan genap

    println(penjumlahan)
    println(pengurangan)
    println(perkalian)
    println(pembagian)
    println(!modulus)
    // tanda "!" adalah negasi atau kebalikan dari nilai boolean

    // augmented assignment
    penjumlahan += 100
    println(penjumlahan)

    penjumlahan /= 10
    println(penjumlahan)

    penjumlahan++
    println(penjumlahan)


}