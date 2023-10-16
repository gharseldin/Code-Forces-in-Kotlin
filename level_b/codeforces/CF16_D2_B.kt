package level_b.codeforces

fun main() {
    val (bag, input) = readln().split(" ").map { it.toInt() }
    val containers = ArrayList<Container>(input)
    for (i in 1 .. input) {
        val (boxes, matches) = readln().split(" ").map { it.toInt() }
        containers.add(Container(boxes, matches))
    }
    containers.sortByDescending { it.matches }
    var bagSize = bag
    var total = 0
    var i = 0
    while (i < containers.size && bagSize > 0) {
        if (bagSize >= containers[i].matchBoxes) {
            total += containers[i].getTotalMatches()
            bagSize -= containers[i].matchBoxes
        } else {
            total += bagSize * containers[i].matches
            bagSize = 0
        }
        i++
    }
    println(total)
}

data class Container(
    val matchBoxes: Int,
    val matches: Int
) {
    fun getTotalMatches() = matches * matchBoxes
}