package br.com.fiap.jurossimplestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import br.com.fiap.jurossimples.Juros

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val juros = Juros()
        juros.capital = 1000.0
        juros.taxa = 10.0
        juros.tempo = 3

        val j = juros.calcularJurosSimples().toString()

        Toast.makeText(this, "Juros=$j", Toast.LENGTH_SHORT).show()
    }
}