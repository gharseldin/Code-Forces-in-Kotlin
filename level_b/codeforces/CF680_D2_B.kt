package level_b.codeforces

fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    val cities = readln().split(" ").map { it.toInt() }
    val start = s - 1
    var left = start - 1
    var right = start + 1
    var total = cities[start]
    while (left >= 0 && right < cities.size) {
        if (cities[left] + cities[right] != 1)
            total += cities[left] + cities[right]
        left--
        right++
    }
    while (left >= 0)
        total += cities[left--]
    while (right < cities.size)
        total += cities[right++]
    println(total)
}