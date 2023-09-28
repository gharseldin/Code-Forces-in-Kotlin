package level_a.codeforces
fun main(args: Array<String>) {
    val input = readln()
    val string = readln()
    val characters = MutableList(26) { _ -> 0 }
    for (c in string)
        characters[Character.toLowerCase(c) - 'a']++
    var panagram = "YES"
    for (i in characters)
        if (i == 0)
            panagram = "NO"
    println(panagram)
}