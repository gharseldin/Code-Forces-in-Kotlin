package level_a

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (yakooRoll, wakkoRoll) = br.readLine().split(' ').map { it.toInt() }
    val maxRoll = max(yakooRoll, wakkoRoll)
    print(
        when (maxRoll) {
            1 -> "1/1"
            2 -> "5/6"
            3 -> "2/3"
            4 -> "1/2"
            5 -> "1/3"
            6 -> "1/6"
            else -> "0/1"
        }
    )
}