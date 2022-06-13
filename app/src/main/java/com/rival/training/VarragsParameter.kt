package com.rival.training

fun main() {
finalValue("Hello", 10,20,4,88,90)

}

fun finalValue(nama:String, vararg values:Int) {
var total = 0
    for(nilai in values) {
        total += nilai
    }
    println("final value $nama = $total")
}