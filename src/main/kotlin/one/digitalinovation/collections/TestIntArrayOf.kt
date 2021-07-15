package one.digitalinovation.collections

fun main() {
    val values = intArrayOf(2,5,8,7,4)

    values.forEach {
        values.sort()
        println(it)
    }
}