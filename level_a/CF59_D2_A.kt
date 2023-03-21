package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var word = br.readLine()
    var lower = 0
    var upper = 0
    for (character in word) {
        if (character.isLowerCase())
            lower++
        else
            upper++
    }
    print(
        if (lower >= upper)
            word.lowercase()
        else
            word.uppercase()
    )
}