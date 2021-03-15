package com.example.myapplication

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class SolutionVestigium {
    fun main(){
        val scanner = Scanner( BufferedReader( InputStreamReader(System.`in`)))
        val useCases = scanner.nextInt()
        var count = 1
        while (count <= useCases) {
            val n = scanner.nextInt()
            var k = 0
            var r = 0
            var c = 0
            val repetitionSetColumn = HashMap<Int, Column>()
            for ( i in 0 until n ) {
                var checkRowRepetition = true
                val repetitionSetRow = HashSet<Int>()
                for(j in 0 until n) {
                    val num = scanner.nextInt()
                    if(checkRowRepetition && !repetitionSetRow.add(num) ) {
                        checkRowRepetition = false
                        ++r
                    }
                    if(j == n - 1) {
                        k += num
                    }
                    val column = repetitionSetColumn[j] ?: Column()
                    if(column.check && !column.set.add(num)) {
                        column.check = false
                        ++c
                    }
                }
            }
            println("Case #$count: $k $r $c")
            ++count
        }
    }
    data class Column(val set: HashSet<Int> = HashSet(), var check: Boolean = true)
}