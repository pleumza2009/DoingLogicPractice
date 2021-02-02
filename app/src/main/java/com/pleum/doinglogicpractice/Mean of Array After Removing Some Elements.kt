package com.pleum.doinglogicpractice

fun main(){

    val arr =  listOf(9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3)

 val show =  trimMean(arr)

    println(show)
}

fun trimMean(arr: List<Int>): Double {

   for (i in arr.indices){
       if (arr[i] == arr.maxOrNull()){
           println("Max :"+arr.maxOrNull())
           arr.drop(i)
       }

       if (arr[i] == arr.minOrNull()){
           println("Min :"+arr.minOrNull())
           arr.drop(i)
       }
   }

    return arr.average()

}