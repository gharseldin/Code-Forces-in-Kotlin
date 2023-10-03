package level_a.codeforces

import kotlin.math.sqrt

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    var totalDistance: Double = 0.0
    var (xCurrent, yCurrent) = readln().split(" ").map { it.toDouble() }
    for (i in 1 until n) {
        val (x, y) = readln().split(" ").map { it.toDouble() }
        totalDistance += sqrt(
            (xCurrent - x) * (xCurrent - x) + (yCurrent - y) * (yCurrent - y)
        )
        xCurrent = x
        yCurrent = y
    }
    println(totalDistance / 50 * k)
}