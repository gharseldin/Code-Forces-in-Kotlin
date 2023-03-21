package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val teams = br.readLine().toInt()
    var home = mutableListOf<Int>()
    var away = mutableListOf<Int>()
    var conflicts = 0
    for (i in 0 until teams) {
        val uniforms = br.readLine().split(' ').map { it.toInt() }
        home.add(uniforms[0])
        away.add(uniforms[1])
    }
    for (i in 0 until home.size) {
        for (j in 0 until away.size) {
            if (home[i] == away[j] && i != j) {
                conflicts++
            }
        }
    }
    print(conflicts)
}