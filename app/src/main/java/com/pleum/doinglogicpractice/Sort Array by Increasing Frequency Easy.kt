package com.pleum.doinglogicpractice

fun main () {
    //[1,1,2,2,2,3]
    val list = listOf(1,1,2,2,2,3)

    println("Answer : "+frequencySort(list).joinToString { x -> x.toString() })
}

fun frequencySort(nums: List<Int>) = nums.groupingBy { it }.eachCount().toList().sortedWith(
        compareBy<Pair<Int,Int>> { (_, freq) -> freq }.thenByDescending { (num) -> num }).flatMap { List(it.second) { _ -> it.first } }.toIntArray()