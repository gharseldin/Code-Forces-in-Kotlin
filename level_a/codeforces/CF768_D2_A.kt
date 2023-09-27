package level_a.codeforces

fun main(args: Array<String>) {
    val numberOfStewards = readln().toInt()
    val stewards = readln().split(" ").map { it.toInt() }
    val sortedStewards = stewards.sorted()
    if (sortedStewards.first() == sortedStewards.last())
        println(0)
    else {
        var disregardedCount = 2
        for (i in 1..sortedStewards.lastIndex) {
            if (sortedStewards[i] == sortedStewards[i - 1])
                disregardedCount++
            else
                break
        }
        for (i in sortedStewards.lastIndex - 1 downTo 0) {
            if (sortedStewards[i] == sortedStewards[i + 1])
                disregardedCount++
            else
                break
        }
        println(numberOfStewards - disregardedCount)
    }
}