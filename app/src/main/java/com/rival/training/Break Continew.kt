package com.rival.training

fun main() {

    var a = 0

    while(true) {
        println(a)
        a++

        if (a == 10) {
            break
        }
    }
    // break untuk menghentikan looping

    for (i in 1..100) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
    // continue untuk melanjutkan looping dengan skip angka
}