package one.digitalinovation.collections

fun main() {
    val salarios = DoubleArray(3)

    val salarios2 = doubleArrayOf(1000.0,4000.0,5000.0)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 4000.0

    salarios.sort()
    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        println(String.format("%.2f",salarios[index]))
    }

    println("-------------------")

    salarios2.sort()
    salarios2.forEach { println(it) }
}