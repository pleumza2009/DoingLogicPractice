package com.pleum.doinglogicpractice

fun main (){

    val s = "011101"

    println(maxScore(s))

}

fun maxScore(s: String): Int {
    var maxSum = 0
    var start = ""
    var end = ""
    for (i in 1 until s.length) {
        println(" i: "+i)
        start = s.substring(0,i)
        println("start : "+start)
        end = s.substring(i)
        println("end : "+end)
        val numZero = start.filter { it == '0' }.count()
        val numOne = end.filter { it == '1' }.count()
        val sum = numZero + numOne
        if (sum > maxSum) {
            maxSum = sum
        }
    }
    return maxSum
}