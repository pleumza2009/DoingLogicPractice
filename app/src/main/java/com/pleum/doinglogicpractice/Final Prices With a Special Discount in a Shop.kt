package com.pleum.doinglogicpractice

fun main(){
    val prices = intArrayOf(10,1,1,6)

    finalPrice(prices)



    println(finalPrice(prices).joinToString { x->"" +x })


}

fun finalPrice (prices: IntArray) :IntArray{
    val result = mutableListOf<Int>()
    for (i in prices.indices){
        for (j in i+1 until prices.size){
            if (prices[j] <= prices[i]){
                val discountPrice = prices[i]-prices[j]
                result.add(discountPrice)
                break
            }
            if(j == prices.size-1){
                result.add(prices[i])
            }

        }
    }
    result.add(prices[prices.size-1])


    return result.toIntArray()
}