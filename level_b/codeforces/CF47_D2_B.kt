package level_b.codeforces

fun main() {
    val set = mutableSetOf<String>()
    val firstComparison = readln()
    if (firstComparison[0] == firstComparison[2]) {
        println("Impossible")
        return
    }
    if (firstComparison[1] == '>') {
        set.add("${firstComparison[2]}${firstComparison[0]}")
    } else {
        set.add("${firstComparison[0]}${firstComparison[2]}")
    }
    val secondComparison = readln()
    if (secondComparison[0] == secondComparison[2]) {
        println("Impossible")
        return
    }
    if (secondComparison[1] == '>') {
        set.add("${secondComparison[2]}${secondComparison[0]}")
    } else {
        set.add("${secondComparison[0]}${secondComparison[2]}")
    }
    val thirdComparison = readln()
    if (thirdComparison[0] == thirdComparison[2]) {
        println("Impossible")
        return
    }
    if (thirdComparison[1] == '>') {
        set.add("${thirdComparison[2]}${thirdComparison[0]}")
    } else {
        set.add("${thirdComparison[0]}${thirdComparison[2]}")
    }
    println(
        getOrder(set)
    )
}

private fun getOrder(set: MutableSet<String>): String {
    if (set.size != 3)
        return "Impossible"
    val leftSide = ArrayList<Char>()
    val rightSide = ArrayList<Char>()
    for (string in set)
        leftSide.add(string[0])
    for (string in set)
        rightSide.add(string[1])
    if (!leftSide.contains('A') && !rightSide.contains('C'))
        return "CBA"
    if (!leftSide.contains('A') && !rightSide.contains('B'))
        return "BCA"
    if (!leftSide.contains('B') && !rightSide.contains('A'))
        return "ACB"
    if (!leftSide.contains('B') && !rightSide.contains('C'))
        return "CAB"
    if (!leftSide.contains('C') && !rightSide.contains('A'))
        return "ABC"
    if (!leftSide.contains('C') && !rightSide.contains('B'))
        return "BAC"
    return "Impossible"
}
