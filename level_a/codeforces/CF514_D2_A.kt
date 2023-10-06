package level_a.codeforces

import kotlin.math.pow

fun main() {
    var number = readln().toLong()
    var result = 0L
    var multiplier = 0.0
    while (number != 0L && number != 9L) {
        val digit = number % 10
        if (digit > 4)
            result += (Math.pow(10.0, multiplier) * (9 - digit)).toLong()
        else
            result += (Math.pow(10.0, multiplier) * digit).toLong()
        number /= 10
        multiplier++
    }
    if (number == 9L)
        result += (10.0.pow(multiplier) * number).toLong()
    println(result)
}

