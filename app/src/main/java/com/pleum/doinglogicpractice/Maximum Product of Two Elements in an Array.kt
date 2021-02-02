package com.pleum.doinglogicpractice

import kotlin.math.max


/*
Share
Given the array of integers nums, you will choose two different indices i and j of that array.
Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
fun  main (){
 var nums :IntArray = intArrayOf(3,4,1,2)

    println(nums.joinToString { x->""+ x })

        println( "result : "+maxProduct(nums))
}

fun maxProduct (numbers :IntArray) : Int{
    val numMutable = mutableListOf<Int>()
    var counter = 0
        while (counter <= 1){
            numbers.sort()
            numbers.reverse()
            numMutable.add(numbers[counter])

            counter++
        }
    println(numbers.joinToString {x -> ""+x })
    println(numMutable)

        val max1 = numMutable[0]-1
    val max2 = numMutable[1]-1
    println("Max1 :"+max1)
    println("Max2 :"+max2)
        val result = (numMutable[0]-1) * (numMutable[1]-1)



    return  result
}