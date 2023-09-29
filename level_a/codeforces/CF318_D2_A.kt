package level_a.codeforces

fun main(args: Array<String>) {
    val (n, k) = readln().split(" ").map { it.toLong() }
    var startOfEven = n / 2
    if (n % 2L == 1L) {
        startOfEven++
    }
    if (k > startOfEven) {
        val diff = k - startOfEven
        println(diff * 2)
    } else {
        println(k * 2 - 1)
    }
}