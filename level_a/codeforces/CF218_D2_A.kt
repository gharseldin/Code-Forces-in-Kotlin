package level_a.codeforces

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val peaks = readln().split(" ").map { it.toInt() }
    val originalPeaks = MutableList(peaks.size) { index -> peaks[index] }
    var peaksToTrim = k
    for (i in 1 until peaks.size step 2) {
        if (peaksToTrim > 0 && peaks[i - 1] < peaks[i] - 1 &&
            peaks[i + 1] < peaks[i] - 1
        ) {
            originalPeaks[i]--
            peaksToTrim--
        }
    }
    for (i in originalPeaks)
        print("$i ")
}