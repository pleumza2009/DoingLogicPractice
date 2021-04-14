package com.pleum.doinglogicpractice

import java.lang.StringBuilder

fun main () {

    val number = "--17-5 229 35-39475 "
//123 4567
    println(reformatNumber(number))
}

fun reformatNumber(number: String): String {
    var reformString = number.replace("\\s".toRegex(), "")
    reformString = reformString.replace("-", "")

    var result = ""





    for (ch in reformString) {

        if (reformString.length > 4) {
            result +=    reformString.take(3)+"-"

          //  println("In Loop :"+ result)
         //   result.append(reformString.take(3) + "-")
            reformString = reformString.drop(3)




        }else if (reformString.length == 3){
            result +=    reformString.take(3)+"-"
            reformString = reformString.drop(3)


        }else if (reformString.length == 4){
            repeat(2){
                result +=    reformString.take(2)+"-"
                reformString = reformString.drop(2)
            }

        }else if (reformString.length == 2){
            result +=    reformString.take(2)+"-"
            reformString = reformString.drop(2)
        }
    }
    if (result.last().equals('-')){
       result = result.dropLast(1)
    }



    println("reformString : $reformString")




    return result

}