package level_b.codeforces

fun main() {
    val input = readln().toInt()
    val colorsRepeat = "ROYGBIV"
    val result = StringBuilder()
    val rotation = input / 7
    for (i in 1..rotation)
        result.append(colorsRepeat)
    val remaining = input % 7
    for(i in 0 until remaining){
        result.append(colorsRepeat[3+(i%4)])
    }
    println(result)
}