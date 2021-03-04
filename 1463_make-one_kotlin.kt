package com.example.kotlin_code_test

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var num = readLine().toInt()
    var list = MutableList(num + 1, { i -> i })

    list[0] = 0
    list[1] = 0

    for (i in 2..list.size - 1) {
        list[i] = list[i - 1] + 1
        if(i%2==0) list[i] = min(list[i], list[i/2] + 1)
        if(i%3==0) list[i] = min(list[i], list[i/3] + 1)
    }

    println(list[num])
}

fun min(num1: Int, num2: Int) = if(num1 < num2) num1 else num2

// 풀지 못하였음
// 참조 사이트 : https://m.blog.naver.com/ourjes/222055951956
// 다시 재도전 예약
