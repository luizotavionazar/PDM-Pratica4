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
        Log.d("Cycle do App","onCreate: Activity 2 criada | Luiz")
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

        Log.d("Cycle do App", "onStart: Activity 2 iniciada | Luiz")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Cycle do App", "onResume: Activity 2 rodando | Luiz")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Cycle do App", "onPause: Activity 2 pausada | Luiz")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Cycle do App", "onStop: Activity 2 parada | Luiz")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Cycle do App", "onRestart: Activity 2 reiniciada | Luiz")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Cycle do App", "onDestroy: Activity 2 destruida | Luiz")
    }
}