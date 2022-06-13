package com.rival.training

fun main() {

    val myFriend = arrayOf("yadi", "jaelani", "josep")
var i = 0
    for (friend in myFriend) {
        println("Hello $friend")
    }

    for (i in 0..100) {
        println(i)
    }
    // akan mencetak angka 0 sampai 100

    for (i in 0 until 100) {
        println(i)
    }
    // akan mencetak angka 0 sampai 99/ tidak mencetak angka terakhir

    for (i in 0 until 100 step 2) {
        println(i)
    }
    // mencetak dengan loncat 2

    while (i < 100) {
        println(i)
        i++
    }
    // di cek dulu baru di cetak

    do {
        println("angka $i")
        i++
    } while (i < 100)
    // di cetak dulu baru di cek

}