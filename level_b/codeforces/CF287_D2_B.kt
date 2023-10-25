package level_b.codeforces

fun main() {
    val (pipes, splitters) = readln().split(" ").map { it.toLong() }
    if (splitters >= pipes || pipes == 1L) {
        println(1)
        return
    }
    var pipesOut = 1L
    var remainingSplitters = splitters
    var count = 0
    while (pipesOut < pipes && remainingSplitters > 1) {
        pipesOut -= 1
        pipesOut += remainingSplitters
        remainingSplitters--
        count++
    }

    println(if (pipesOut >= pipes) count else -1)
}