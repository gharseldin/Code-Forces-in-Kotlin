package level_a.codeforces

fun main() {
    val (n, m, a) = readln().split(" ").map { it.toLong() }
    var length = n / a
    if (n % a != 0L)
        length++
    var width = m / a
    if (m % a != 0L)
        width++
    println(length * width)
}