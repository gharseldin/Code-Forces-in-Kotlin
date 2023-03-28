package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val magnets = br.readLine().toInt()
    var groups = 0
    var previousPole = '2'
    for (i in 1..magnets) {
        val magnet = br.readLine()
        when (previousPole) {
            '0' -> {
                previousPole = if (magnet[1] == '1') {
                    groups++
                    '1'
                } else {
                    '0'
                }
            }

            '1' -> {
                previousPole = if (magnet[1] == '0') {
                    groups++
                    '0'
                } else {
                    '1'
                }
            }

            else -> {
                groups++
                previousPole = magnet[1]
            }
        }
    }
    print(groups)
}