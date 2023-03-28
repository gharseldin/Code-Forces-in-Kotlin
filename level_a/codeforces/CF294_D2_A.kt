package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val birdsValues = br.readLine().split(' ').map { it.toInt() }
    var birds = mutableListOf<Int>().apply { addAll(birdsValues) }
    val shots = br.readLine().toInt()
    for (i in 1..shots) {
        val shot = br.readLine().split(' ').map { it.toInt() }
        updateWires(birds, shot)
    }
    for (element in birds) {
        println(element)
    }
}
fun updateWires(birds: MutableList<Int>, shot: List<Int>) {
    val wire = shot[0] - 1
    val birdShot = shot[1]
    val birdsOnWire = birds[wire]
    if (wire != 0) {
        birds[wire - 1] += birdShot - 1
    }
    if (birds.size > wire + 1) {
        birds[wire + 1] += birdsOnWire - birdShot
    }
    birds[wire] = 0
}