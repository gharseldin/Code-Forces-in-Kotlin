package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (numberOfOranges, maxSize, maxWaste) = br.readLine().split(' ').map { it.toInt() }
    val oranges = br.readLine().split(' ').map { it.toInt() }
    var wasteRemovals = 0
    var waste = 0
    for (orange in oranges) {
        if (orange <= maxSize) {
            waste += orange
            if (waste > maxWaste) {
                waste = 0
                wasteRemovals++
            }
        }
    }

    print(wasteRemovals)
}