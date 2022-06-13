package com.rival.training

fun main() {
    val example = """
        &halo kotlin
        &saya adalah muhammad rival
        &saya ingin belajar kotlin
    """.trimIndent()
    // trimIndent() untuk menghilangkan spasi di awal dan akhir string

    val example2 = """
        &halo kotlin
        &saya adalah muhammad rival
        &saya ingin belajar kotlin
    """.trimMargin("&")
    // trimMargin("&") untuk menghilangkan & di awal dan akhir string

    println(example)
    println(example2)


    val firstName = "Muhammad"
    val lastName = "Rival"
    val fullName = firstName + " " + lastName
    // + untuk menggabungkan string

    println(fullName)

    // menggunakan string template
    val address = "halo nama saya $fullName, rumah saya di cikarang"
    val example3 = "5 + 3 = ${5 + 3}"
    val exampleBoolean = "variable fisrtName dan lastName = ${firstName == lastName}"

    println(address)
    println(example3)
    println(exampleBoolean)
    println(APP)
}