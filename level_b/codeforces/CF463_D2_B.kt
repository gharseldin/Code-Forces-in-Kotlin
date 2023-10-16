package level_b.codeforces

import kotlin.math.abs

fun main() {
    readln()
    val pylons = readln().split(" ").map { it.toInt() }
    var max = 0
    for(i in pylons)
        if(i > max)
            max = i
    println(max)
}