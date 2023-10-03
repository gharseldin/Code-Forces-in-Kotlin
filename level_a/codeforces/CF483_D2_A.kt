package level_a.codeforces

fun main() {
    val (x, y) = readln().split(" ").map { it.toLong() }
    var result = "-1"
    for (i in x..y - 2) {
        for (j in i + 1..y - 1) {
            for (k in j + 1..y) {
                if (isCoPrime(i, j) && isCoPrime(j, k) && !isCoPrime(i, k))
                    result = "$i $j $k"
            }
        }
    }
    println(result)
}

fun isCoPrime(i: Long, j: Long) = greatestCommonDivisor(i, j) == 1L

fun greatestCommonDivisor(i: Long, j: Long): Long {
    return if (j == 0L)
        i
    else
        greatestCommonDivisor(j, i % j)
}