package one.digitalinovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("------SOMATORIA-----------")
    println(salarios.somatoria())

    println("------MEDIA-----------")
    println(salarios.media())
}
