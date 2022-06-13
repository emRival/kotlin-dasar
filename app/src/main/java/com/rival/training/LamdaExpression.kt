package com.rival.training

fun main() {

//    val convertUP: (String) -> String = { nama: String ->
//        nama.uppercase()
//    }
//
//    val nama1 = convertUP("Rival")
//    println(nama1)

    val lamdaNama: (String, Int) -> String = { nama: String, umur: Int ->
        when {
            umur > 17 -> "anak dengan nama $nama, umurnya masih remaja"
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            else -> "anak dengan nama $nama, umurnya masih muda"
        }
    }

    val namaPakeLamda = lamdaNama("tio", 10)
    println(namaPakeLamda)
}

