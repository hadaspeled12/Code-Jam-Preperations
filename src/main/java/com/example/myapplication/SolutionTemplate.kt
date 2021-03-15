package com.example.myapplication

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class SolutionTemplate {
    fun main(){
        val scanner = Scanner( BufferedReader( InputStreamReader(System.`in`)))
        val useCases = scanner.nextLine().toInt()
        var count = 1
        while (count <= useCases) {
            val line = scanner.nextLine()
            println("Case #$count: $line")
            ++count
        }
    }
}