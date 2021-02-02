package com.pleum.doinglogicpractice

fun main () {
   val releaseTimes = listOf(9,29,49,50)
    val s  = "cbcd"
    println("Answer : "+slowestKey(releaseTimes,s))

}

fun slowestKey(releaseTimes: List<Int>, keysPressed: String): Char {
    var res = keysPressed[0]

    var prevDur = 0
    var maxDuration = 0

    for(i in 0 until keysPressed.length){
        println("KEY : "+keysPressed[i])
        val duration = releaseTimes[i] - prevDur
        println("RELEASETIME : "+releaseTimes[i])
        println("prevDur : "+prevDur)
        println("DURATION : "+duration)
        println("MAX DURATION : "+maxDuration)
        if(duration == maxDuration){
            if(keysPressed[i] - 'a' > res - 'a') {
                res = keysPressed[i]
            }
        }else if(duration > maxDuration){
            res = keysPressed[i]
            maxDuration = duration
        }


        prevDur = releaseTimes[i]
    }

    return res
}