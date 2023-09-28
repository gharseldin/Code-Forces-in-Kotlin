package level_a.codeforces

fun main(args: Array<String>) {
    val direction = readln()
    val string = readln()
    val output = StringBuilder()
    for (char in string)
        output.append(char shift direction)
    println(output.toString())
}

infix fun Char.shift(direction: String): Char {
    val top = "qwertyuiop"
    val mid = "asdfghjkl;"
    val bot = "zxcvbnm,./"
    var line = top
    if (mid.contains(this))
        line = mid
    if (bot.contains(this))
        line = bot
    return if (direction == "R")
        line[line.indexOf(this) - 1]
    else
        line[line.indexOf(this) + 1]
}