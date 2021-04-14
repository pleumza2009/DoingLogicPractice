package com.pleum.doinglogicpractice

fun main (){


   val s = "RLRRLLRLRL"

    println(balancedStringSplit(s))
}


fun balancedStringSplit(s: String): Int {
    val count = 0
    var array = ArrayList<String>()



    var string = s

        for (i in s.indices){
                if (s[i].equals('R') && s[i+1].equals('L') && !s[i].equals(s.last())){
                       array.add(string.take(2))
                    string = string.drop(2)
                    println(string)
                }else if (s[i].equals('R') && s[i+1].equals('R') && !s[i].equals(s.last())){
                    array.add(string.take(4))
                    string = string.drop(4)
                    println(string)
                }

        }

    return array.size
}