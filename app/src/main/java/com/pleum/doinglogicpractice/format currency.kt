package com.pleum.doinglogicpractice

import java.text.NumberFormat
import java.util.*

fun main(){

    val formatCurrency =  NumberFormat.getCurrencyInstance()
    formatCurrency.maximumFractionDigits = 2
    formatCurrency.currency = Currency.getInstance("THB")



    println( formatCurrency.format(10000.12))




}