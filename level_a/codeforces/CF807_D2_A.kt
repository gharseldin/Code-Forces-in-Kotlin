package level_a.codeforces

fun main(args: Array<String>) {
    val competitors = readln().toInt()
    val scores = MutableList(competitors) { _ -> Score(0, 0) }
    for (i in 1..competitors) {
        val (before, after) = readln().split(" ").map { it.toInt() }
        scores[i - 1] = Score(before, after)
    }
    var output = "maybe"
    for (i in 1..scores.lastIndex) {
        if (scores[i].before > scores[i - 1].before)
            output = "unrated"
    }
    for (score in scores) {
        if (score.before != score.after)
            output = "rated"
    }
    println(output)
}

data class Score(
    val before: Int,
    val after: Int
)