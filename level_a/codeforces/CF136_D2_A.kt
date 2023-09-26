package level_a.codeforces
fun main(args: Array<String>) {
    readln()
    val list = readln().split(" ").map { it.toInt() }
    val given = MutableList(list.size) { i -> 0 }
    for (i in list.indices) given[list[i] - 1] = i + 1
    for (i in given) print("$i ")
}