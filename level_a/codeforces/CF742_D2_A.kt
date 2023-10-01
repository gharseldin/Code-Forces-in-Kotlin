package level_a.codeforces

fun main() {
    val n = readln().toInt()
    if (n == 0) {
        println(1)
    } else {
        val remainder = n % 4
        println(
            when (remainder) {
                0 -> 6
                1 -> 8
                2 -> 4
                3 -> 2
                else -> -1
            }
        )
    }
}