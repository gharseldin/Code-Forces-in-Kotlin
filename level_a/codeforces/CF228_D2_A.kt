package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val horseShoeSet = br.readLine().split(' ').map { it.toInt() }
    val distinctSet = mutableSetOf<Int>()
    for (horseShoe in horseShoeSet) {
        distinctSet.add(horseShoe)
    }
    print(4 - distinctSet.size)
}