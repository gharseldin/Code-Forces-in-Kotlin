package level_a.codeforces

fun main() {
    val time = readln()
    var over = false
    for (i in time.lastIndex downTo 1) {
        if (time[i] == '1')
            over = true
    }
    var trains = time.length / 2
    if (time.length % 2 == 1 && over)
        trains++
    println(trains)
}