package level_a.codeforces

fun main() {
    val sidesMap = mapOf(
        "Tetrahedron" to 4,
        "Cube" to 6,
        "Octahedron" to 8,
        "Dodecahedron" to 12,
        "Icosahedron" to 20
    )
    val input = readln().toInt()
    var faces = 0
    for (i in 1..input) {
        val polyhedron = readln()
        faces += sidesMap[polyhedron] ?: 0
    }
    println(faces)
}