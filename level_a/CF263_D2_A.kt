package level_a

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var location = Point(0,0)
    for( i in 1 .. 5){
        val line = br.readLine().split(' ')
        for(j in 0 .. 4){
            if(line[j] == "1"){
                location.x = i
                location.y = j+1
            }
        }
    }
    print(abs(3-location.x) + abs(3-location.y) )
}

data class Point (var x: Int, var y: Int)