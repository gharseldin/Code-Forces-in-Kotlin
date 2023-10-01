package level_a.codeforces

fun main(args: Array<String>) {
    val music = readln()
    val original = StringBuilder()
    var i = 0
    while (i <= music.length - 3) {
        if (music[i] == 'W') {
            if (music[i + 1] == 'U') {
                if (music[i + 2] == 'B') {
                    if (original.isNotEmpty() && original.last() != ' ') {
                        original.append(" ")
                    }
                    i += 3
                    continue
                }
            }
        }
        original.append(music[i])
        i++
    }
    while (i < music.length) {
        original.append(music[i])
        i++
    }
    println(original.trim())
}