package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (length, distinctCharacter) = br.readLine().split(' ').map { it.toInt() }
    val password = StringBuilder()
    var cursor = 0
    for (i in 1..length) {
        password.append('a' + cursor)
        cursor = (cursor + 1) % distinctCharacter
    }
    print(password.toString())
}