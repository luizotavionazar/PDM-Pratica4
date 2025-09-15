package com.luizotavio.quartoapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        Log.d("Cycle","onCreate: Activity 2 criada")
        val botaoRetorna: Button = findViewById(R.id.button)
        botaoRetorna.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        //val mensagemTexto: TextView = findViewById(R.id.tviewmensagem)
        //val imagem: ImageView = findViewById(R.id.imageView)
        //val campoTexto: EditText = findViewById(R.id.tviewCampoNome)
        //val nome: String
        //mensagemTexto.text="Olá, ${nome}!"
        //imagem.setImageResource(R.drawable.avatar)

        Log.d("Cycle", "onStart: Activity 2 iniciada")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Cycle", "onResume: Activity 2 rodando")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Cycle", "onPause: Activity 2 pausada")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Cycle", "onStop: Activity 2 parada")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Cycle", "onRestart: Activity 2 reiniciada")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Cycle", "onDestroy: Activity 2 destruida")
    }
}