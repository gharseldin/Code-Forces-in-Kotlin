package level_a.codeforces

import kotlin.math.pow

fun main() {
    val (x, y) = readln().split(" ").map { it.toInt() }
    var i = x + 1
    var found = false
    while (i < y) {
        if (isPrime(i))
            found = true
        i++
    }
    println(
        if (isPrime(y) && !found && y > x)
            "YES"
        else
            "NO"
    )
}

fun isPrime(n: Int): Boolean {
    val limit = n.toDouble().pow(0.5).toInt()
    for (i in 2..limit) {
        if (n % i == 0)
            return false
    }
    return true
}