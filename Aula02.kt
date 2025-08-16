import java.util.Scanner

fun main() {
    //escolhe o exercicio que quer
    val scan = Scanner(System.`in`)
    print("Escolha um exercício de 1 a 10:")
    val escolha = scan.nextLine()

    println("\nEXERCÍCIO $escolha\n")

    //exercicio 1
    if (escolha == "1") {
        println("Insira seu nome: ")
        val nome = scan.nextLine()

        println("Seu nome é $nome")
    }

    //exercicio 2
    if (escolha == "2") {
        var idade = ""
        var txtAgain = ""
        var again = true
        do {
            println("Insira sua idade: ")
            idade = scan.nextLine()
            println("Sua idade é $idade, deseja mudar?\n(s/n):")

            txtAgain = scan.nextLine()

            if (txtAgain == "s") {
                again = true

            } else {
                again = false
            }

        }while (again == true)
    }

    //exc 3
    if (escolha == "3") {
        //insercao numero
        println("Insira um Double: ")
        val numString = scan.nextLine()

        //transform string pra double e dps double pra int
        val numDouble: Double = numString.toDouble()
        val numInt: Int = numDouble.toInt()

        //print variaveis
        println("Seu número Double ($numDouble) se transformou em Int ($numInt)")
    }

    //exc 4
    if (escolha == "4") {
        println("Você é maior de idade?\n(s/n)")
        val txtResposta = scan.nextLine()

        var boolResposta: Boolean = false
        if (txtResposta == "s") {
            boolResposta = true
        }

        if (boolResposta) {
            println("Você é mesmo maior de idade")

        } else {
            println("Você não é maior de idade ainda")

        }
    }

    //exc 5
    if (escolha == "5") {
        println("Insira seu nome: ")
        val stringNome = scan.nextLine()

        val charLetra: Char = stringNome.first()

        println("A Inicial do nome $stringNome eh $charLetra")
    }

    //exc 6
    if (escolha == "6") {
        println("Insira seu nome: ")
        val nome = scan.nextLine()

        println("Insira seu sobrenome: ")
        val sobrenome = scan.nextLine()

        val nomeCompleto = nome + " " + sobrenome

        println("Seu nome comleto é $nomeCompleto")

    }

    //exc 7
    if (escolha == "7") {
        println("Insira um número: ")
        val num1 = scan.nextLine().toInt()

        println("Insira outro número: ")
        val num2 = scan.nextLine().toInt()

        val soma = num1 + num2
        println("A soma de $num1 + $num2 é igual a $soma")

    }

    //exc 8
    if (escolha == "8") {
        println("Insira um número: ")
        val num = scan.nextLine().toInt()

        if (num < 0) {
            println("$num é negativo")

        } else {
            println("$num é positivo")

        }

    }
    
}
