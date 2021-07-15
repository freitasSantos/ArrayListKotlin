package one.digitalinovation.collections

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Hugo"
    nomes[1] = "Cleiton"
    nomes[2] = "Helio"

    val nomes2 = arrayOf("Rodrigo", "Camila", "Felix","Tói")

    for (nome in nomes){
        println(nome)
    }

    println("------------------------")

    nomes2.forEach {
        println(it)
    }
}