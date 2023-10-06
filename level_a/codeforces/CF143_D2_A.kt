package level_a.codeforces

fun main() {
    val (r1, r2) = readln().split(" ").map { it.toInt() }
    val (c1, c2) = readln().split(" ").map { it.toInt() }
    val (d1, d2) = readln().split(" ").map { it.toInt() }
    val a = (r1 - c2 + d1) / 2
    val b = r1 - a
    val c = d2 - b
    val d = r2 - c
    if (a in (1..9) &&
        b in (1..9) &&
        c in (1..9) &&
        d in (1..9) &&
        allDistinct(a, b, c, d) &&
        c1 == a + c &&
        c2 == b + d
    )
        println(
            """
            $a $b
            $c $d
        """.trimIndent()
        )
    else
        println(-1)
}

fun allDistinct(vararg numbers: Int): Boolean {
    val set = mutableSetOf<Int>()
    for (number in numbers)
        set.add(number)
    return numbers.size == set.size
}