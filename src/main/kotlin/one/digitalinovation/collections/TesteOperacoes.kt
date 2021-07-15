package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,4000.0, 3000.0,8000.0)

    salarios.sort()
    salarios.forEach { println(it) }

    println("---------------")

    println("Maior salario = ${salarios.maxOrNull()}")
    println("Menor salario = ${salarios.minOrNull()}")
    println("Media salario = ${salarios.average()}")

    val salariosMaior2500 = salarios.filter{ it > 2500}
    println("Filtro salario maior que 2500: ${salariosMaior2500}")

    println("Salario entre 2000 e 5000 = ${salarios.count{it in 2000.0..5000.0}}")


    println("encontrar valor especifico 3000: ${salarios.find{it == 3000.0}}")

    println("encontrar valor especifico 3001: ${salarios.find{it == 3001.0}}")

    println("encontrar valor especifico com retorno booleando (1000) => ${salarios.any{it == 1000.0}}")
}