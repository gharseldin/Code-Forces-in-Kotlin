package level_a.codeforces

import java.util.Deque
import java.util.LinkedList

fun main(args: Array<String>) {
    var numberOfSnacks = readln().toInt()
    val snacks = readln().split(" ").map { it.toInt() }
    val bag = hashSetOf<Int>()
    for (i in snacks) {
        if (i != numberOfSnacks) {
            bag.add(i)
        } else {
            print("$i ")
            numberOfSnacks--
            while (bag.contains(numberOfSnacks)) {
                print("$numberOfSnacks ")
                numberOfSnacks--
            }
        }
        println()
    }
}