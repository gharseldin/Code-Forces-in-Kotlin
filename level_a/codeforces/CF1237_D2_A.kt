package level_a.codeforces

fun main() {
    val size = readln().toInt()
    val scores = IntArray(size)
    for (i in 1..size)
        scores[i - 1] = readln().toInt()
    var increase = true
    for (index in scores.indices) {
        if (scores[index] % 2 == 0)
            scores[index] = scores[index] / 2
        else {
            if (increase) {
                if (scores[index] % 2 < 0)
                    scores[index] = scores[index] / 2
                else
                    scores[index] = scores[index] / 2 + (scores[index] % 2)
            } else {
                if (scores[index] % 2 < 0)
                    scores[index] = scores[index] / 2 + (scores[index] % 2)
                else
                    scores[index] = scores[index] / 2
            }
            increase = !increase
        }
    }
    for (score in scores) {
        println(score)
    }
}