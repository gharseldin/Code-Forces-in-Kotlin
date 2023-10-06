package level_a.codeforces

fun main() {
    val numberOfDice = readln().toShort()
    val topValue = readln().toShort()
    println(couldIdentifyAllSides(numberOfDice, topValue))
}

private fun couldIdentifyAllSides(numberOfDice: Short, topValue: Short): String {
    for (i in 1..numberOfDice) {
        val (left, right) = readln().split(" ").map { it.toShort() }
        if (left == topValue || left == (7 - topValue).toShort() ||
            right == topValue || right == (7 - topValue).toShort()
        )
            return "NO"
    }
    return "YES"
}