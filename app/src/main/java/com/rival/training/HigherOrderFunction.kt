package com.rival.training

fun main() {
    val lamdaUP = { nama: String -> nama.uppercase() }
    val lamdaDown = { nama: String -> nama.lowercase() }

    val lamdaNilai = { angka: Int ->
        if (angka % 2 == 0) {
            "Nilai Genap"
        } else {
            "Nilai Ganjil"
        }
    }

    val lamdaMurid = {nama:String, umur:Int ->
        when {
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya masih remaja"
            else -> "anak dengan nama $nama, umurnya masih muda"
        }
    }

    println(hello("Rival", lamdaUP))
    println(cekNilai(10, lamdaNilai))
    println(cekNamaUmur("Rival", 20, lamdaMurid))
}

fun hello(value: String, convert: (String) -> String): String {
    return "hello nama saya ${convert(value)}"
}

fun cekNilai(nilai: Int, cek:(Int) -> String): String {
    return "nilai ini adalah ${cek(nilai)}"
}

fun cekNamaUmur(nama:String, umur:Int, result:(String, Int) -> String): String {
    return result(nama, umur)
}
