package level_b.codeforces

fun main() {
    readln()
    val roofs = readln().split(" ").map { it.toInt() }
    val max = IntArray(roofs.size)
    var maximum = 1
    for (i in roofs.indices) {
        max[i] = calculateRoofs(roofs, i)
        if (max[i] > maximum)
            maximum = max[i]
    }
    println(maximum)
}

private fun calculateRoofs(roofs: List<Int>, i: Int): Int {
    var max = 1
    var itr = i + 1
    while (itr < roofs.size && roofs[itr] <= roofs[itr - 1]) {
        max++
        itr++
    }
    itr = i - 1
    while (itr >= 0 && roofs[itr] <= roofs[itr + 1]) {
        max++
        itr--
    }
    return max
}