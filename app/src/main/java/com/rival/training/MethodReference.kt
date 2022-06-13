package com.rival.training

fun toNama(nama: String, umur: Int): String =
    when {
        umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
        umur > 17 -> "anak dengan nama $nama, umurnya masih remaja"
        else -> "anak dengan nama $nama, umurnya masih muda"
    }


fun main() {

    val namaLamda: (String, Int) -> String = ::toNama

    val cetak = namaLamda("Rival", 22)
    println(cetak)
}