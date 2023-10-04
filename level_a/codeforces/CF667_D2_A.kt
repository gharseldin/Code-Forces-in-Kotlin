package level_a.codeforces

fun main() {
    val (d, h, v, e) = readln().split(" ").map { it.toDouble() }
    val waterGrowth = Math.PI * (d / 2) * (d / 2) * e  // Cubic centimeters per second
    if (waterGrowth >= v) {
        println("NO")
    } else {
        val waterDecreasesBy = v - waterGrowth // Water decrease per second.
        println("YES\n${Math.PI * (d / 2) * (d / 2) * h / waterDecreasesBy}")
    }
}