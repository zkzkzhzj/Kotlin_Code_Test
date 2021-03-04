package com.example.kotlin_code_test

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    while (sc.hasNextInt()) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        println(a + b)
    }
    sc.close()
}