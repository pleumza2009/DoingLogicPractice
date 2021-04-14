package com.pleum.doinglogicpractice

fun main(){

    val n = 4

    println(" Answer: "+totalMoney(n))
}

fun totalMoney(n: Int): Int {
    var time = 1
    var day = 1
    var increacsePerWeek = 0
    var total = 0

    while (day<=7 && time <= n  ){

        total += day + increacsePerWeek
        println(day)



        time++
        day++
        if (day>7) {
            day = 1
            increacsePerWeek++

        }
    }



    return total
}
