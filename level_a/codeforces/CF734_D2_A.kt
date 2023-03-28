package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val games = br.readLine().trim().toInt()
    val results = br.readLine().trim()
    
    var antonWins = 0
    var danikWins = 0

    for (i in 0 until games) {
        if (results[i] == 'A')
            antonWins++
        if (results[i] == 'D')
            danikWins++
    }
    println(
        if (danikWins > antonWins)
            "Danik"
        else if (danikWins < antonWins)
            "Anton"
        else
            "Friendship"
    )
}