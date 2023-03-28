package level_a

import java.io.BufferedReader
import java.io.InputStreamReader


fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    for (i in 1..input) {
        val word = br.readLine()
        if (word.length > 10) {
            println("${word.first()}${word.length - 2}${word.last()}")
        } else {
            println(word)
        }
    }
}
