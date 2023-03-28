package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val lettersSet = br.readLine()
    val letterStrings = lettersSet.substring(1, lettersSet.length - 1).split(", ")
    val letterArray = Array<Int>(26) { 0 }
    for (letter in letterStrings) {
        if (letter.isNotBlank()) {
            letterArray[letter.first() - 'a']++
        }
    }
    var distinct = 0
    for (letter in letterArray) {
        if (letter != 0) {
            distinct++
        }
    }
    print(distinct)
}