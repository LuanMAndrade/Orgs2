package com.example.Orgs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.Orgs2.DAO.Companion.dao
import com.example.Orgs2.databinding.ActivityFormularioBinding
import com.example.Orgs2.databinding.DialogAlertBinding

class FormularioActivity : AppCompatActivity() {


    val binding by lazy {
        ActivityFormularioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.formularioButton.setOnClickListener{
            val nome = binding.formularioNameText.text.toString()
            val descricao = binding.formularioDescText.text.toString()
            val valor = binding.formularioValueText.text.toString()
        val produto = Product(nome, descricao, valor.toDouble())
            dao.add(produto)
        }


        binding.formularioImage.setOnClickListener{
            AlertDialog.Builder(this)
                .setView(DialogAlertBinding.inflate(layoutInflater).root).show()
        }
    }
}