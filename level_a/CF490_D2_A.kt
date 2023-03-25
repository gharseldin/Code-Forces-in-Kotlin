package level_a

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min
import java.util.Deque
import java.util.LinkedList

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val children = br.readLine().toInt()
    val programmingQueue: Deque<Int> = LinkedList()
    val mathQueue: Deque<Int> = LinkedList()
    val sportsQueue: Deque<Int> = LinkedList()
    val skills = br.readLine().split(' ').map { it.toInt() }
    for (i in skills.indices) {
        when (skills[i]) {
            1 -> programmingQueue.add(i)
            2 -> mathQueue.add(i)
            else -> sportsQueue.add(i)
        }
    }
    val maxNumberOfTeams = min(min(programmingQueue.size, mathQueue.size), sportsQueue.size)
    println(maxNumberOfTeams)
    for (i in 1..maxNumberOfTeams) {
        println(
            "${programmingQueue.removeFirst()+1} " +
                    "${mathQueue.removeFirst()+1} " +
                    "${sportsQueue.removeFirst()+1}"
        )
    }
}