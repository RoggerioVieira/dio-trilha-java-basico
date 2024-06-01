import java.util.Scanner

fun calculoImposto(salario: Float): Float {
    val aliquota: Float = when {
        salario in 0.0..1100.0 -> 0.05f
        salario in 1100.01..2500.0 -> 0.10f
        else -> 0.15f
    }
    return aliquota * salario
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite o valor do salário:")
    val valorSalario = scanner.nextFloat()

    println("Digite o valor dos benefícios:")
    val valorBeneficios = scanner.nextFloat()

    val valorImposto = calculoImposto(valorSalario)
    val saida = valorSalario - valorImposto + valorBeneficios

    println(String.format("%.2f", saida))
}
