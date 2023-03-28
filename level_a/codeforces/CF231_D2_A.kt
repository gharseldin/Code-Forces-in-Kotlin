package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val problems = br.readLine().toInt()
    var solved = 0
    for (i in 1..problems) {
        val (a, b, c) = br.readLine().split(' ')
        val total = a.toInt() + b.toInt() + c.toInt()
        if (total > 1)
            solved++
    }
    print(solved)
}