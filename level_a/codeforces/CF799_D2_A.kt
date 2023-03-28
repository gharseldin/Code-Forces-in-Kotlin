package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val (neededCakes, timeForBake, capacity, timeToBuildOven)
            = bufferedReader.readLine().split(' ').map { it.toInt() }
    val rounds = if (neededCakes % capacity == 0) {
        neededCakes / capacity
    } else {
        neededCakes / capacity + 1
    }
    val totalTimeForOneOven = rounds * timeForBake
    val timeDifference = totalTimeForOneOven - timeToBuildOven
    print(
        if ((totalTimeForOneOven - timeToBuildOven) <= timeForBake) {
            "NO"
        } else {
            "YES"
        }
    )
}