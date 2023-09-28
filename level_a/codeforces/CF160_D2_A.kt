package level_a.codeforces

fun main(args: Array<String>) {
    val totalCoins = readln().toInt()
    val coins = readln().split(" ").map { it.toInt() }
    val sortedCoins = coins.sorted()
    // [1, 2, 4, 5, 6, 7, 10]
    var mySum = 0
    var twinsSum = sortedCoins.sum()
    var minCoins = 0
    while (minCoins < totalCoins && mySum <= twinsSum) {
        minCoins++
        mySum += sortedCoins[totalCoins - minCoins]
        twinsSum -= sortedCoins[totalCoins - minCoins]
    }
    println(minCoins)
}