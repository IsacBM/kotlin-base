// Isac BM - 2K23
fun main(){
    // Saida:
    println("Eae Rapa!")

    // Váriaveis:
    val nameUser = "Zacks" // Imutavel: Val
    val numConta = 10
    var saldoConta = 0.0 // Mutavel:Var

    //Váriaveis na saida:
    println("Titular da conta: $nameUser, Número da conta: $numConta")

    //Chamando uma Função:
    testaCondicional(saldoConta)
    saldoConta = depositar(saldoConta,350.0)
    println("Novo saldo: $saldoConta")

}

// Funções:
fun testaCondicional(saldoConta: Double){
    // Verificações/Condições: Primeira Forma
    //saldoConta -= 500
    if (saldoConta > 0){
        println("Saldo Positivo! :)")
    } else if (saldoConta == 0.0) {
        println("Saldo Zerado! :/")
    } else {
        println("Saldo Negativo! :(")
    }
    // Verificações/Condições: Segunda Forma
    when{
        saldoConta > 0 -> println("Saldo Positivo! :)")
        saldoConta == 0.0 -> println("Saldo Zerado! :/")
        saldoConta < 0 -> println("Saldo Negativo! :(")
    }
}
fun depositar(saldoAtual: Double, valorDepositado: Double): Double{
    var saldoFinal = saldoAtual + valorDepositado
    return saldoFinal
}