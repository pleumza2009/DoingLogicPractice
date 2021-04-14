package com.pleum.doinglogicpractice

fun main() {
    var result = 0
    val n = "234"
    val numbers = n.map(Character::getNumericValue).toIntArray()
    var Sum = 0
    var Product = 1

    for (digit in numbers){

        val numChar = digit
            println(numChar)
        Product =  Product*numChar
        println("Product :"+Product)
        Sum = Sum+ numChar
        println("Sum : "+ Sum)
        result = Product-Sum
        println("Product - Sum :${Product}-${Sum}")
    }

    println(result)




}