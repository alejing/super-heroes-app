package com.example.proyectosuperheroes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectosuperheroes.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Hide the Action Bar for the activity
        supportActionBar?.hide()
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnIniciarSesion?.setOnClickListener { irAInicioDeSesion() }

    }

    fun irAInicioDeSesion(){
        val myIntent = Intent(this, InicioSesion::class.java)
        startActivity(myIntent)
        //Toast.makeText(this, "Btn Iniciar Sesion Presionado", Toast.LENGTH_LONG).show()
    }
}