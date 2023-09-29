package level_a.codeforces

fun main(args: Array<String>) {
    val levels = readln().toInt()
    val levelsLittleXCanPass = readln().split(" ").map { it.toInt() }
    val levelsLittleYCanPass = readln().split(" ").map { it.toInt() }

    val levelsPass = MutableList(levels) { _ -> 0 }
    for (i in 1..levelsLittleXCanPass.lastIndex)
        levelsPass[levelsLittleXCanPass[i] - 1]++
    for (i in 1..levelsLittleYCanPass.lastIndex)
        levelsPass[levelsLittleYCanPass[i] - 1]++
    var output = "I become the guy."
    for (i in levelsPass)
        if (i == 0)
            output = "Oh, my keyboard!"
    println(output)
}