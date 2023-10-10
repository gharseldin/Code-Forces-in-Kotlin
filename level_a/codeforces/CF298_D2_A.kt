package level_a.codeforces

fun main() {
    readln()
    val path = readln()
    var i = 0
    while (path[i] == '.')
        i++
    val start = i
    if (path[i] == 'L') {
        println("${i + 1} $i")
    } else {
        while (path[i] == 'R') {
            i++
        }
        if (path[i] == 'L') {
            println("${i} ${i + 1}")
        } else {
            println("${start + 1} ${i + 1}")
        }
    }
}