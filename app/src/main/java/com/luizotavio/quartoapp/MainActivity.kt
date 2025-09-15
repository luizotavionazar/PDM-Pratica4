package com.luizotavio.quartoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val campoTexto: EditText = findViewById(R.id.tviewCampoNome)
        val botaoEntrar: Button = findViewById(R.id.button)


        botaoEntrar.setOnClickListener {
            val nome: String = campoTexto.text.toString()
            val intecao = Intent(this, MainActivity2::class.java)
            startActivity(intecao)
        }

        Log.d("Cycle","onCreate: Activity 1 criada")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Cycle", "onStart: Activity 1 iniciada")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Cycle", "onResume: Activity 1 rodando")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Cycle", "onPause: Activity 1 pausada")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Cycle", "onStop: Activity 1 parada")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Cycle", "onRestart: Activity 1 reiniciada")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Cycle", "onDestroy: Activity 1 destruida")
    }
}