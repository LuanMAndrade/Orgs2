package com.example.Orgs2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Orgs2.DAO.Companion.dao
import com.example.Orgs2.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityListaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.listaRecyclerView.adapter = RecyclerLista(this, dao)
        binding.floatingActionButton.setOnClickListener {
            startActivity(Intent(this, FormularioActivity::class.java))
        }
    }
}
