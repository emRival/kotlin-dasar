package com.rival.training

fun main() {
//    cetakNama("muhammad", lastName = "Rizki")
    // named argumen ininsupaya kita ga harus tau urutan argumen
//    cetakNama("muhammad", "Rizki", "Febriliyansyah")
    cetakNamaAnak("rival", 10)
    cetakNamaAnak("yanto", 18)
    cetakNamaAnak("hidan", 22)
   val cetak = cetakWhen("rival ddd", 10)
    println(cetak)
}

fun cetakNama(firstName: String, middleName: String = "", lastName: String) {
    println("Nama saya adalah $firstName $middleName $lastName")
}
// dengan parameter yang dapat tidak di isi


fun cetakNamaAnak(nama: String, umur: Int) {
    if (umur > 20) {
        println("anak dengan nama $nama, umurnya sudah dewasa")
    } else if (umur > 17) {
        println("anak dengan nama $nama, umurnya masih remaja")
    } else {
        println("anak dengan nama $nama, umurnya masih muda")
    }
}

fun cetakWhen(nama: String, umur: Int): String {
    return when {
        umur > 17 -> "anak dengan nama $nama, umurnya masih remaja"
        umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
        else -> "anak dengan nama $nama, umurnya masih muda"
    }
}