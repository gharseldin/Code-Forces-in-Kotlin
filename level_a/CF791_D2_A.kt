package level_a

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val (limakWeight, bobWeight) = bufferedReader.readLine().split(' ')
    var limakWeigthInt = limakWeight.toInt()
    var bobWeightInt = bobWeight.toInt()
    var years = 0
    while(limakWeigthInt <= bobWeightInt){
        years++
        limakWeigthInt *= 3
        bobWeightInt *= 2
    }
    print(years)
}