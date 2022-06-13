package com.rival.training

fun main() {

    val arrayNama: Array<String?> = arrayOf("ahmad", "rizal", "saputra", null)
    //var dan val tidak ngaruh dalam array

    println(arrayNama.size)
    println(arrayNama.get(2))
    println(arrayNama[1])

    arrayNama.set(1, "yanto")
    println(arrayNama[1])

    arrayNama[0] = "hidan"
    println(arrayNama[0])

    arrayNama.forEach {
        print("nama saya $it, ")
    }


    val array2: Array<String?> = arrayOfNulls(5)
    array2.set(0, "ahmad")

    array2.forEach {
        println("nama saya $it, ")
    }

}