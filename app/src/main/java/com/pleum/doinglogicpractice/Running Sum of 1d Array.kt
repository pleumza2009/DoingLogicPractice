package com.pleum.doinglogicpractice

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

fun main(){

    val nums = intArrayOf(1,1,1,1,1)

    println(nums.joinToString {it -> it.toString() })
    println(runningSum(nums).joinToString {it -> it.toString() })
}

fun runningSum(nums: IntArray): IntArray {
    val mutableList = mutableListOf<Int>()
    var sumAllNum = 0
    for (i in nums.indices){
            sumAllNum =  sumAllNum+nums[i]
            mutableList.add(sumAllNum)
    }

    return mutableList.toIntArray()
}