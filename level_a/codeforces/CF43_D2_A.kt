package level_a.codeforces

fun main(args: Array<String>) {
    val scores = readln().toInt()
    val firstTeam = readln()
    var secondTeam = String()
    var advantageFirstTeam = 1
    for (i in 2..scores) {
        val team = readln()
        if (team == firstTeam) {
            advantageFirstTeam++
        } else {
            advantageFirstTeam--
            if (secondTeam == "") {
                secondTeam = team
            }
        }
    }
    println(
        if (advantageFirstTeam > 0) firstTeam else secondTeam
    )
}