package level_a.codeforces

fun main() {
    val number = readln().toLong()
    println(
        if (number % 2L == 1L) {
            -(number / 2 + 1)
        } else {
            number / 2
        }
    )
}