package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val firstString = br.readLine().lowercase()
    val secondString = br.readLine().lowercase()
    print(
        if (firstString < secondString) {
            -1
        } else if (firstString > secondString) {
            1
        } else {
            0
        }
    )
}