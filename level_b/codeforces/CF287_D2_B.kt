package level_b.codeforces

fun main() {
    val (pipes, splitters) = readln().split(" ").map { it.toLong() }
    if (pipes == 1L) {
        println(0)
        return
    }
    if (splitters >= pipes) {
        println(1)
        return
    }
    val split = splitters - 1
    val pipesRequired = pipes - 1
    val maxPipes = split * (split + 1) / 2
    if (maxPipes < pipesRequired) {
        println(-1)
        return
    }

    var pipesOut = 1L

    val result = binarySearch(1L, split - 1, pipesRequired, maxPipes)
    println(
        if (result.exact) split - result.value else split - result.value + 1
    )
}

private fun binarySearch(start: Long, end: Long, target: Long, maxPipes: Long): Result {
    if (start > end)
        return Result(start, false)
    val mid = start + (end - start) / 2
    val pipes = maxPipes - (mid * (mid + 1) / 2)
    return if (pipes == target)
        Result(mid, true)
    else if (pipes < target)
        binarySearch(1L, mid - 1, target, maxPipes)
    else
        binarySearch(mid + 1, end, target, maxPipes)
}

data class Result(
    val value: Long,
    val exact: Boolean
)