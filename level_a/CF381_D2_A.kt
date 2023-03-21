package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val cards = br.readLine().split(' ').map { it.toInt() }
    var start = 0;
    var end = cards.size - 1
    var serejaScore = 0
    var dimaScore = 0
    var serejaTurn = true
    for (i in 1..cards.size) {
        if (cards[start] > cards[end]) {
            if (serejaTurn) {
                serejaScore += cards[start]
            } else {
                dimaScore += cards[start]
            }
            start++
        } else {
            if (serejaTurn) {
                serejaScore += cards[end]
            } else {
                dimaScore += cards[end]
            }
            end--
        }
        serejaTurn = !serejaTurn
    }
    print("$serejaScore $dimaScore")
}