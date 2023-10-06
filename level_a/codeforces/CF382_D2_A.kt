package level_a.codeforces

import java.lang.StringBuilder
import kotlin.math.abs

fun main() {
    val (left, right) = readln().split("|")
    val remaining = readln()
    val difference = left.length - right.length
    val leftString = StringBuilder(left)
    val rightString = StringBuilder(right)
    println(
        if (abs(difference) <= remaining.length && (remaining.length - difference) % 2 == 0) {
            val split = abs(difference)
            if (difference < 0) {
                leftString.append(remaining.substring(0, split))
            } else {
                rightString.append(remaining.substring(0, split))
            }
            populateSides(split, remaining, leftString, rightString)
        } else {
            "Impossible"
        }
    )
}

private fun populateSides(
    split: Int,
    remaining: String,
    leftString: StringBuilder,
    rightString: StringBuilder
): String {
    for (i in split until remaining.length) {
        if (i % 2 == 0) {
            leftString.append(remaining[i])
        } else {
            rightString.append(remaining[i])
        }
    }
    return "$leftString|$rightString"
}