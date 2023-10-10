package level_a.codeforces

fun main(){
    var goal = readln().toInt()
    var added = 0
    while(goal != 0){
        added += goal%2
        goal/=2
    }
    println(added)
}