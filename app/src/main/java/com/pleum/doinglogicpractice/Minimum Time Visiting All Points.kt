package com.pleum.doinglogicpractice

import java.lang.Math.*

data class Point(val x:Int, val y:Int)

fun main(){
   // points = [[1,1],[3,4],[-1,0]]
   // Output: 7
    val x = intArrayOf(1,3,-1)
    val y = intArrayOf(1,4,0)

   val points = arrayOf(x,y)






    println("Total time : "+minTimeToVisitAllPoints(points))

}

fun minTimeToVisitAllPoints(points : Array<IntArray>) : Int {
    var time = 0
    var currentPoint = Point(points[0][0], points[1][0])
    for (i in 1 until  points.get(0).size) {
        val nextPoint = Point(points[0][i], points[1][i])
        println("Round : ${i}")
        println("Current : ${currentPoint}")
        println("Next : ${nextPoint}")
        time += Math.max(Math.abs(currentPoint.x - nextPoint.x), Math.abs(currentPoint.y- nextPoint.y))
        println("Time Round ${i} : ${time}")
        currentPoint = nextPoint

    }
    return time
}













