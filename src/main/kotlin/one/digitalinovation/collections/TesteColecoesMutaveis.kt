package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1000.0,"CLT")
    val maria = Funcionario("Maria",4000.0,"PJ")

    val funcionarios = mutableListOf(joao,maria)

    funcionarios.forEach{println(it)}

    funcionarios.add(pedro)
    println("---------ADD----")
    funcionarios.forEach{println(it)}

    println("------REMOVE-------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("------SET-------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    println("------SET ADD-------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)

    funcionariosSet.forEach{println(it)}

    println("------SET Remove-------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}
}