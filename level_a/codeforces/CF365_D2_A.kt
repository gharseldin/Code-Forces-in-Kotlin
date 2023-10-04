package level_a.codeforces

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    var totalGoodNumbers = 0
    for (i in 1..n) {
        val numbers = MutableList(10) { _ -> 0 }
        var number = readln().toInt()
        while (number > 0) {
            numbers[number % 10]++
            number /= 10
        }
        var goodNumber = true
        for (j in 0..k) {
            if (numbers[j] == 0)
                goodNumber = false
        }
        if (goodNumber)
            totalGoodNumbers++
    }
    println(totalGoodNumbers)
}