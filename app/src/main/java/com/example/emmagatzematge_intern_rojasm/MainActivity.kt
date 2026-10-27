package com.example.emmagatzematge_intern_rojasm

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTexto = findViewById<EditText>(R.id.etTexto)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            val filename = "myfile"
            val fileContents = etTexto.text.toString() + "\n"

            openFileOutput(filename, Context.MODE_APPEND).use {
                it.write(fileContents.toByteArray())
            }
        }
    }
}