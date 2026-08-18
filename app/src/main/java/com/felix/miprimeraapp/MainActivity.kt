package com.felix.miprimeraapp

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Contenedor principal vertical
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(60, 60, 60, 60)
            setBackgroundColor(Color.parseColor("#F5F5F5"))
        }

        // Título principal
        val titulo = TextView(this).apply {
            text = "Nivel 2: Interfaz Interactiva"
            textSize = 22f
            gravity = Gravity.CENTER
            setTextColor(Color.parseColor("#333333"))
            setPadding(0, 0, 0, 40)
        }

        // Texto que muestra el número
        val textoContador = TextView(this).apply {
            text = "Clics: $contador"
            textSize = 32f
            gravity = Gravity.CENTER
            setTextColor(Color.parseColor("#0066CC"))
            setPadding(0, 0, 0, 60)
        }

        // Botón 1: Incrementar
        val botonSumar = Button(this).apply {
            text = "¡Presióname!"
            textSize = 18f
            setOnClickListener {
                contador++
                textoContador.text = "Clics: $contador"
            }
        }

        // Botón 2: Reiniciar
        val botonReiniciar = Button(this).apply {
            text = "Reiniciar"
            textSize = 16f
            setOnClickListener {
                contador = 0
                textoContador.text = "Clics: $contador"
            }
        }

        // Agregar elementos al contenedor
        layout.addView(titulo)
        layout.addView(textoContador)
        layout.addView(botonSumar)
        layout.addView(botonReiniciar)

        setContentView(layout)
    }
}
