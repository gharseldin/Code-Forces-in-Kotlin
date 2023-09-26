package level_a.codeforces

import kotlin.math.abs

fun main(args: Array<String>) {
    readlnOrNull()
    val cities = readln().split(" ").map { it.toInt() }
    for (i in cities.indices) {
        if (i == 0) {
            val min = cities[i + 1] - cities[i]
            val max = cities.last() - cities.first()
            println("$min $max")
        } else if (i == cities.lastIndex) {
            val min = cities[i] - cities[i - 1]
            val max = cities.last() - cities.first()
            println("$min $max")
        } else {
            val min = abs(cities[i] - cities[i - 1]).coerceAtMost(abs(cities[i + 1] - cities[i]))
            val max = abs(cities[i] - cities[0]).coerceAtLeast(abs(cities[cities.size - 1] - cities[i]))
            println("$min $max")
        }
    }
}