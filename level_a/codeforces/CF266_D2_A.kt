package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val stones = br.readLine()
    var lastStone = stones?.get(0)
    var removed = 0
    stones?.let {
        for (i in 1 until stones.length) {
            if (stones[i] == lastStone)
                removed++
            lastStone = stones[i]
        }
    }
    print(removed)
}