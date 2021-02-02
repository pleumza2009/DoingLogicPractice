package com.pleum.doinglogicpractice



fun main(){
    val s = "cbzxy"
    println("Length: "+maxLengthBetweenEqualCharacters(s))
}

fun maxLengthBetweenEqualCharacters(s: String): Int {
    var countLength = 0
    var firstChar = ' '

    for (char in s) {
        if (countLength == 0) {
            firstChar = char
            println("FirstChar:" + firstChar)
            countLength++
        }
        if (char != firstChar) {
            countLength++
        } else if (s.last() == firstChar) {
            countLength--
        }




        println(" CUNT: " + char)


    }
    if (s.last() != s.first()) {
       countLength = -1
    }
    return countLength
}

