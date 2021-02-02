package com.pleum.doinglogicpractice

fun main() {
    val arr = intArrayOf(1,4,2,5,3)



   println("Answer :"+ sumOddLengthSubarrays(arr))

}


fun sumOddLengthSubarrays(arr: IntArray): Int {
    var result = 0
    val size = arr.size - 1
    for (i in 0..size) {
        println()
        print("I :["+i+"]")

        var arraySum = 0
        for (j in i..size) {
            println()
            println(" J:["+j+"]:")
            arraySum += arr[j]

            val isArrayLengthOdd = (j - i + 1) % 2 == 1
            println("ArrayLengthOdd:"+(j - i + 1))
            if (isArrayLengthOdd) result += arraySum
            println("oper: "+arraySum)
            println("NUMBER: "+result)
        }
        println(" SUMMARY "+result)
    }

    return result
}