package com.example.kotlin_code_test

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val i = sc.nextInt()
    println(fibonacci(i, 0, 1))
}

fun fibonacci(i: Int, first: Int, second: Int): Int{
    return if (i <= 0)
        first
    else
        fibonacci(i-1, second, first + second)
}