package level_a.codeforces

fun main(args: Array<String>) {
    val side = readln().toInt()
    val paper = MutableList(
        side
    ) { _ ->
        String()
    }
    for (i in 0 until side)
        paper[i] = readln()
    println(
        if (verifiedX(side, paper)) "YES" else "NO"
    )
}

private fun verifiedX(side: Int, paper: MutableList<String>): Boolean {
    val x = paper[0][0]
    val y = paper[0][1]
    if (x == y)
        return false
    for (i in 0 until side) {
        for (j in 0 until side) {
            if (i == j || i == (side - j - 1)) {
                if (paper[i][j] != x)
                    return false
            } else {
                if (paper[i][j] != y)
                    return false
            }
        }
    }
    return true
}