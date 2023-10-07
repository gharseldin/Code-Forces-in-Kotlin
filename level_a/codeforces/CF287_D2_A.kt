package level_a.codeforces

fun main() {
    val painting = MutableList(4) { _ -> "" }
    for (i in 0..3)
        painting[i] = readln()
    var result = "NO"
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (isSquare(i, j, painting) || isSquareMissingOne(i, j, painting))
                result = "YES"
        }
    }
    println(result)
}

fun isSquare(i: Int, j: Int, painting: MutableList<String>): Boolean {
    val cell = painting[i][j]
    return painting[i + 1][j] == cell &&
            painting[i + 1][j + 1] == cell &&
            painting[i][j + 1] == cell
}

fun isSquareMissingOne(i: Int, j: Int, painting: MutableList<String>): Boolean {
    val count = mutableMapOf<Char, Int>()
    count[painting[i][j]] = count.getOrDefault(painting[i][j], 0) + 1
    count[painting[i + 1][j]] = count.getOrDefault(painting[i + 1][j], 0) + 1
    count[painting[i][j + 1]] = count.getOrDefault(painting[i][j + 1], 0) + 1
    count[painting[i + 1][j + 1]] = count.getOrDefault(painting[i + 1][j + 1], 0) + 1
    return Math.abs(
        count.getOrDefault('#', 0) - count.getOrDefault('.', 0)
    ) == 2
}