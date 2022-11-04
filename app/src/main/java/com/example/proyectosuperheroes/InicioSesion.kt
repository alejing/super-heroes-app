package com.example.proyectosuperheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Hide the Action Bar for the activity
        //supportActionBar?.hide()
        setContentView(R.layout.activity_inicio_sesion)
    }
}