package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1000.0,"CLT")
    val maria = Funcionario("Maria",4000.0,"PJ")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)

    println("---------------")
    println("Unindo 2 listas")
    val funcionarios3 = funcionarios1.union(funcionarios2)
    funcionarios3.forEach{println(it)}

    println("---------------")
    println("subtraindo objetos iguais da lista : (A - B) ")
    val funcionarios4 = funcionarios3.subtract(funcionarios2)
    funcionarios4.forEach{println(it)}

    println("---------------")
    println("intersecao da lista : (A ∩ B) ")
    val intersectFunc = funcionarios3.intersect(funcionarios2)
    intersectFunc.forEach{println(it)}
}