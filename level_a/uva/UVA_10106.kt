package level_a.uva

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    do {
        val first = br.readLine()
        if (first.isNotEmpty()) {
            val second = br.readLine()
            val result = StringBuilder()
            print(multiply(first, second))
        } else {
            return
        }
    } while (true)
}

fun multiply(first: String, second: String): String {
    var result = StringBuilder("0")
    var zeros = 0
    for (digit in first.reversed()) {
        var carry = 0
        var digitResult = StringBuilder()
        for (d in second.reversed()) {
            val temp = digit.digitToInt() * d.digitToInt() + carry
            digitResult.insert(0, temp % 10)
            carry = temp / 10
        }
        if (carry != 0) {
            digitResult.insert(0, carry)
        }
        for (i in 1..zeros) {
            digitResult.append(0)
        }
        zeros++
        val newResult = StringBuilder()
        add(
            result.toString(),
            digitResult.toString(),
            result.length - 1,
            digitResult.length - 1,
            0,
            newResult
        )
        result = newResult
    }
    return result.toString()
}

fun add(
    first: String,
    second: String,
    firstIndex: Int,
    secondIndex: Int,
    remainder: Int,
    result: StringBuilder
) {
    var remain = remainder
    var index2 = secondIndex
    var index1 = firstIndex
    if (firstIndex == -1) {
        while (index2 >= 0) {
            var temp = second[index2].digitToInt()
            if (remain != 0) {
                temp += remain
                remain = temp / 10
            }
            result.insert(0, temp % 10)
            index2--
        }
        if (remain != 0) {
            result.insert(0, 1)
        }
    } else if (secondIndex == -1) {
        while (remain != 0 && index1 >= 0) {
            val temp = first[index1].digitToInt() + remain
            result.insert(0, temp % 10)
            remain = temp / 10
            index1--
        }
        while (index1 >= 0) {
            result.insert(0, first[index1])
            index1--
        }
        if (remain != 0) {
            result.insert(0, 1)
        }
    } else {
        val temp = first[firstIndex].digitToInt() + second[secondIndex].digitToInt() + remainder
        result.insert(0, temp % 10)
        add(
            first,
            second,
            firstIndex - 1,
            secondIndex - 1,
            temp / 10,
            result
        )
    }
}