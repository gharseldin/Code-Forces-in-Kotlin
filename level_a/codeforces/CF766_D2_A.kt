package level_a.codeforces

import kotlin.math.max

fun main(args: Array<String>) {
    val firstString = readln()
    val secondString = readln()
    println(
        if (firstString == secondString) "-1" else max(firstString.length, secondString.length)
    )
}