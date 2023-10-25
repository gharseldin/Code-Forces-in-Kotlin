package level_b.codeforces

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    println(findMinimumStart(n, k, 0, Int.MAX_VALUE))
}

private fun findMinimumStart(n: Int, k: Int, start: Int, end: Int): Int {
    if (start == end)
        return start
    val mid = start + (end - start) / 2
    val totalCodeWritten = findTotal(mid, k)
    return if (totalCodeWritten == n) {
        mid
    } else if (totalCodeWritten < n) {
        findMinimumStart(n, k, mid + 1, end)
    } else {
        findMinimumStart(n, k, start, mid)
    }
}

private fun findTotal(v: Int, k: Int): Int {
    var total = v
    var remaining = v / k
    while (remaining != 0) {
        total += remaining
        remaining /= k
    }
    return total
}