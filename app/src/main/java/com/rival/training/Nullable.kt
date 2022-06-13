package com.rival.training

const val APP = "Muhamad Rival"

fun main() {
    var myName: String? = "Rival"
    println(myName?.length)
    myName = null
    println(myName?.length)
}