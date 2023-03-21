package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    var input = br.readLine().split(' ').map { it.toInt() }
    val sorted = input.sorted()
    for (element in sorted){
        print("$element ")
    }
}