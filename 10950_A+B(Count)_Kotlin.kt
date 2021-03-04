package com.example.kotlin_code_test

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val count = sc.nextInt()

    for(i in 1..count) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        println(a + b)
    }
}