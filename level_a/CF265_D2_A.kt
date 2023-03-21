package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stones = br.readLine()
    val instructions = br.readLine()
    var lisaPosition = 1
    for (instruction in instructions)
        if (instruction == stones[lisaPosition - 1])
            lisaPosition++
    print(lisaPosition)
}