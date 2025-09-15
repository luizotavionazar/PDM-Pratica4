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

        Log.d("Cycle do App","onCreate: Activity 1 criada | Luiz")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Cycle do App", "onStart: Activity 1 iniciada | Luiz")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Cycle do App", "onResume: Activity 1 rodando | Luiz")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Cycle do App", "onPause: Activity 1 pausada | Luiz")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Cycle do App", "onStop: Activity 1 parada | Luiz")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Cycle do App", "onRestart: Activity 1 reiniciada | Luiz")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Cycle do App", "onDestroy: Activity 1 destruida | Luiz")
    }
}