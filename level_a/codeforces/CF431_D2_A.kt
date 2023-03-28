package level_a


import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val calorieCost = br.readLine().split(' ').map { it.toInt() }
    val moves = br.readLine()
    var caloriesConsumed = 0
    for (move in moves) {
        caloriesConsumed += calorieCost[move.digitToInt() - 1]
    }
    print(caloriesConsumed)
}