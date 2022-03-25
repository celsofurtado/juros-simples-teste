package br.com.fiap.jurossimples

class Juros {

    var capital: Double = 0.0
    var taxa: Double = 0.0
    var tempo: Int = 0

    fun calcularJurosSimples() = capital * (taxa / 100) * tempo

}