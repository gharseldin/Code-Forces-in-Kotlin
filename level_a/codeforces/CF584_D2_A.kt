package level_a.codeforces

fun main(args: Array<String>) {
    val (n, t) = readln().split(" ").map { it.toInt() }

    if (n == 1 && t == 10) {
        println(-1)
    } else {
        print(t)
        if (t == 10) {
            for (i in 0 until n - 2) {
                print(0)
            }
        } else {
            for (i in 0 until n - 1) {
                print(0)
            }
        }
        println()
    }
}