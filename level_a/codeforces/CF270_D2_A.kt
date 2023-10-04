package level_a.codeforces

fun main() {
    val input = readln().toInt()
    for (i in 1..input) {
        val angle = readln().toInt()
        println(
            if (360 % (180 - angle) == 0) "YES" else "NO"
        )
    }
}