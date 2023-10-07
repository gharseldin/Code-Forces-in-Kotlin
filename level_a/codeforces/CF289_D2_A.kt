package level_a.codeforces


fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val ranges = ArrayList<Range>()
    for (i in 1..n) {
        val (min, max) = readln().split(" ").map { it.toInt() }
        ranges.add(Range(min, max))
    }
    ranges.sortBy { it.min }
    val combinedRanges = ArrayList<Range>()
    combinedRanges.add(ranges[0])
    var index = 0
    for (i in 1..ranges.lastIndex) {
        if (ranges[i].min - combinedRanges[index].max == 1) {
            val lastRange = combinedRanges.removeLast()
            combinedRanges.add(Range(lastRange.min, ranges[i].max))
        } else {
            index++
            combinedRanges.add(ranges[i])
        }
    }
    var moves = 0
    for (range in combinedRanges) {
        val total = range.max - range.min + 1
        val mod = total % k
        moves += k - mod
    }
    println(
        if (moves % k == 0) 0 else moves % k
    )
}

data class Range(
    val min: Int,
    val max: Int
)