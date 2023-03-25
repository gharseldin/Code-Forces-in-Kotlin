package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbers = br.readLine().split('+').map { it.toInt() }
    print(numbers.sorted().joinToString (separator = "+"))
}