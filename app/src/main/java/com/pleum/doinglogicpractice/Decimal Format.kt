package com.pleum.doinglogicpractice

import java.text.DecimalFormat

fun main(){

    val number = 1250750.85

    val df  = DecimalFormat("#,##0.00")
    println(df.format(number))



}