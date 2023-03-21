package level_a


import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val events = br.readLine().split(' ').map { it.toInt() }
    var policeForce = 0
    var untreatedCrime = 0
    for (event in events) {
        if (event == -1) {
            if (policeForce > 0) {
                policeForce--
            } else {
                untreatedCrime++
            }
        } else {
            policeForce += event
        }
    }
    print(untreatedCrime)
}