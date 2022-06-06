package com.example.Orgs2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.Orgs2.DAO.Companion.dao
import com.example.Orgs2.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityListaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dao.add(Product("luan","muniz",10.0, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Orange-Fruit-Pieces.jpg/1200px-Orange-Fruit-Pieces.jpg"))
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.listaRecyclerView.adapter = RecyclerLista(this, dao)
        binding.floatingActionButton.setOnClickListener{
            startActivity(Intent(this,FormularioActivity::class.java))
        }
    }
}
