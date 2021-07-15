package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("Joao",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1000.0,"CLT")
    val maria = Funcionario("Maria",4000.0,"PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)


    println("-----------Find By Id----------")

    println(repositorio.findById(joao.nome))

    println("-----------Find ALL----------")

    println(repositorio.findAll().forEach{println(it)})

    println("----remove-------")
    repositorio.remove(maria.nome)
    println(repositorio.findAll().forEach{println(it)})
}