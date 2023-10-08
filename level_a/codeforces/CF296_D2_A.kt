package level_a.codeforces

fun main() {
    val input = readln()
    val numbers = readln().split(" ").map { it.toInt() }
    val count = MutableList(1001) { _ -> 0 }
    for (number in numbers)
        count[number]++
    count.sort()
    val max = count.last()
    var mid = numbers.size / 2
    if (numbers.size % 2 == 1)
        mid++
    println(
        if (numbers.size > 1 && max > mid)
            "NO"
        else
            "YES"
    )
}
