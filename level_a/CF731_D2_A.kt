package level_a

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    var lastCharacter = 'a'
    var moves = 0
    for (character in input) {
        val diff = abs(lastCharacter - character)
        moves += if (diff <= 13) {
            diff
        } else {
            26 - diff
        }
        lastCharacter = character
    }
    print(moves)
}