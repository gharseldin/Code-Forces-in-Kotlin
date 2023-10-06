package level_a.codeforces

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nMap = mutableMapOf(
        0 to 0,
        1 to 0,
        2 to 0,
        3 to 0,
        4 to 0
    )
    val mMap = mutableMapOf(
        0 to 0,
        1 to 0,
        2 to 0,
        3 to 0,
        4 to 0
    )
    for (i in 1..n)
        nMap[i % 5] = nMap[i % 5]?.plus(1) ?: 0
    for (i in 1..m)
        mMap[i % 5] = mMap[i % 5]?.plus(1) ?: 0
    println(
        nMap[0]!!.toLong() * mMap[0]!!.toLong() +
                nMap[1]!!.toLong() * mMap[4]!!.toLong() +
                nMap[2]!!.toLong() * mMap[3]!!.toLong() +
                nMap[3]!!.toLong() * mMap[2]!!.toLong() +
                nMap[4]!!.toLong() * mMap[1]!!.toLong()
    )
}