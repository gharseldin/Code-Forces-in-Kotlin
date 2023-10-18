package level_b.codeforces

fun main() {
    val number = readln()
    if (number.length == 1) {
        println(0)
        return
    }
    var magic = 0
    var latest = 0
    for (char in number) {
        latest += char - '0'
    }
    magic++
    while (latest > 9) {
        latest = getDigitTotal(latest)
        magic++
    }
    println(magic)
}

private fun getDigitTotal(number: Int): Int {
    var total = 0
    var num = number
    while (num != 0) {
        total += num % 10
        num /= 10
    }
    return total
}