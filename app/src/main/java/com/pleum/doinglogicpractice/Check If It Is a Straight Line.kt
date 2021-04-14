package com.pleum.doinglogicpractice

data class Coordinate (val x : Int , val y : Int)


fun main(){

    val x1 = intArrayOf(1,2,3,4,5)
    val y1 = intArrayOf(2,3,4,5,6)
    val list1 = listOf(x1,y1)

    val x2 = intArrayOf(1,2,3,4,5)
    val y2 = intArrayOf(1,2,4,5,6)
    val list2 = listOf(x2,y2)

    println("List 1 : ${checkStraightLine(list1)}")
    println("List 2 : ${checkStraightLine(list2)}")


}


fun checkStraightLine(coordinates : List<IntArray>) : Boolean {
        var isStraight = true

        var currentPosition = Coordinate(coordinates[0][0],coordinates[1][0])
  var   nextPosition = Coordinate(coordinates[0][1],coordinates[1][1])

    val firstConstantX =  nextPosition.x - currentPosition.x
    val firstConstantY =  nextPosition.y - currentPosition.y

    for (i in 1 until  coordinates.get(0).size){
        nextPosition = Coordinate(coordinates[0][i],coordinates[1][i])

        val constantX = nextPosition.x - currentPosition.x
        val constantY = nextPosition.y - currentPosition.y

        if (constantX != firstConstantX || constantY != firstConstantY){
            return  false
        }
        currentPosition = nextPosition
    }


        return true
}