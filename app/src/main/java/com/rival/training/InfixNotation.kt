package com.rival.training

fun main() {
val nama = "Rival" convert "UP"
    println(nama)
}

infix fun String.convert(type: String) : String {
   return if (type == "UP") {
       this.uppercase()
    } else {
       this.lowercase()
    }
}

