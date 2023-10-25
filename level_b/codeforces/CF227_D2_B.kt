package level_b.codeforces

fun main() {
    val input = readln().toInt()
    val array = readln().split(" ").map { it.toInt() }
    val queries = readln().toInt()
    val queryArray = readln().split(" ").map { it.toInt() }
    var left = 0L
    var right = 0L

    val map = mutableMapOf<Int, ArrayList<Int>>()
    for (i in array.indices) {
        if (!map.containsKey(array[i]))
            map[array[i]] = ArrayList()
        map[array[i]]!!.add(i)
    }
    for (i in queryArray) {
        left += map[i]!![0] + 1
        right += input - map[i]!![map[i]!!.lastIndex]
    }
    println("$left $right")
}