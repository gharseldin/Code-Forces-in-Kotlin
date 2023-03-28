package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(' ').map { it.toInt() }
    var price = input[0]
    var extraCoin = input[1]
    var items = 1
    while (price * items % 10 != extraCoin && price * items % 10 != 0) {
        items++
    }
    print(items)
}