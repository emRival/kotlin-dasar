package com.rival.training

fun main() {
  val luas = luasSegitiga(12, 100)
    println(luas)
//    luasPersegi(10,10)
    println(luasPersegi(10,10))
}

fun luasSegitiga(alas: Int, tinggi: Int) : Int {
    return (0.5 * alas * tinggi).toInt()
}

fun luasPersegi(sisi1 : Int, sisi2 : Int) : Int =  sisi1 * sisi2
// single expression function