package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val name = br.readLine()
    val set = mutableSetOf<Char>()
    for (character in name) {
        set.add(character)
    }
    print(
        if (set.size % 2 == 1)
            "IGNORE HIM!"
        else
            "CHAT WITH HER!"
    )
}