package level_a.codeforces

fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val pictureMatrix = MutableList(n) { _ ->
        List(m) { _ -> 'B' }
    }
    for (i in 0 until n)
        pictureMatrix[i] = readln().split(" ").map { it.toCharArray()[0] }

    var color = "#Black&White"
    for (i in 0 until n) {
        for (j in 0 until m) {
            val pixelColor = pictureMatrix[i][j]
            if (
                pixelColor == 'C' ||
                pixelColor == 'M' ||
                pixelColor == 'Y'
            )
                color = "#Color"
        }
    }
    println(color)
}