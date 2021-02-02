package com.pleum.doinglogicpractice

fun main (){
    val row1 = intArrayOf(1,2,3)
    val row2 = intArrayOf(4,5,6)
    val row3 = intArrayOf(7,8,9)
    val mantrix = arrayOf(row1,row2,row3)

   print( "Answer:"+diagonalSum(mantrix))
}

fun diagonalSum(mat: Array<IntArray>): Int {

    var result = 0
    val size = mat.size - 1
    println(mat.indices)
    for (i in mat.indices) {
        result += mat[i][i]
        println(result)
        if (size - i != i) result += mat[i][size - i]
    }
    return result

    }

