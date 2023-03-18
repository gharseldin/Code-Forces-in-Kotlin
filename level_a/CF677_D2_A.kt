package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split("\\s+".toRegex())
    val heights = br.readLine().split("\\s+".toRegex())
    var width = 0
    for(height in heights){
        width += if (height.toInt()>input[1].toInt()) {
            2
        } else {
            1
        }
    }
    print(width)
}