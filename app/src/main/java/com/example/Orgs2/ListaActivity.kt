package com.example.Orgs2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.Orgs2.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityListaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.listaRecyclerView.adapter = vi



        binding.floatingActionButton.setOnClickListener{
            startActivity(Intent(this,FormularioActivity::class.java))
        }
    }
}
