package level_a.codeforces

fun main() {
    val input = readln()
    val directions = readln()
    val coordinates = readln().split(" ").map { it.toInt() }
    val approaching = ArrayList<ApproachingParticles>()
    for (i in 0 until coordinates.lastIndex)
        if (directions[i] == 'R' && directions[i + 1] == 'L')
            approaching.add(ApproachingParticles(coordinates[i], coordinates[i + 1]))
    approaching.sortBy {
        it.right - it.left
    }
    if (approaching.isEmpty()) {
        println(-1)
    } else {
        val difference = approaching[0].right - approaching[0].left
        var time = if (difference % 2 == 0) difference / 2 else difference / 2 + 1
        println(time)
    }
}

data class ApproachingParticles(
    val left: Int,
    val right: Int
)