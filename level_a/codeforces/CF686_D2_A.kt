package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (lineLength, iceCreams) = br.readLine().split(' ').map { it.toLong() }
    var distressedKids = 0
    for (i in 1..lineLength) {
        val kid = br.readLine()
        if (kid.first() == '+') {
            iceCreams += kid.substring(2).toInt()
        } else {
            val requested = kid.substring(2).toInt()
            if (requested > iceCreams) {
                distressedKids++
            } else {
                iceCreams -= requested
            }
        }
    }

    println("$iceCreams $distressedKids")
}