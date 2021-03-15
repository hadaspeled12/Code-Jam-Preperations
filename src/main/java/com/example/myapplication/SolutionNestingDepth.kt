package com.example.myapplication

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

class SolutionNestingDepth {
    fun main(){
        val scanner = Scanner( BufferedReader( InputStreamReader(System.`in`)))
        val useCases = scanner.nextLine().toInt()
        var count = 1
        while (count <= useCases) {
            val line = scanner.nextLine()
            val s = StringBuilder()
            var open = 0
            for(c in line) {
                val lastC = c.toString().toInt()
                while ( lastC > open) {
                    s.append("(")
                    ++open
                }
                while (lastC < open) {
                    s.append(")")
                    --open
                }
                s.append(c)
            }

            while (open > 0) {
                s.append(")")
                --open
            }
            println("Case #$count: $s")
            ++count
        }
    }
}