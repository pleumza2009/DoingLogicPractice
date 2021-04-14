package com.pleum.doinglogicpractice
//Not Complete
fun main(){

    var s = "aabbaaxybbaabb"
    val x = 4
    val y = 5



    println( maximumGain(s,x,y))
/*
    var twoChar = s.takeLast(2)
       s = s.dropLast(2)


    println(s)
    println(twoChar)
    println(s.contains("ab"))


    println(s.lastIndexOf("ab"))
    println(s.length-2)

 */




}

fun maximumGain(s: String, x: Int, y: Int): Int {
    var totalScore = 0
    var newString = s
    var twoChar : String

    println("First Round :"+newString)
    while (newString.contains("ab") || newString.contains("ba")){

       if (newString.contains("ab") && newString.lastIndexOf("ab") == newString.length-2){
           totalScore += x
           twoChar = newString.takeLast(2)
           newString = newString.dropLast(2)

       }else
        if (newString.contains("ba") && newString.lastIndexOf("ba") == newString.length-2){
            totalScore += y
            twoChar = newString.takeLast(2)
            newString = newString.dropLast(2)

        }else
        if (!newString.contains("ba") || !newString.contains("ab")){
            newString = newString.dropLast(1)
        }
        println(newString)
        println("ab :"+newString.contains("ab"))
        println("ba  :"+newString.contains("ba"))
        println("Total Score : "+ totalScore)

    }







    return  totalScore
}