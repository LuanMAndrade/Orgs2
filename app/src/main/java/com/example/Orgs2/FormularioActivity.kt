package com.example.Orgs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import coil.load
import com.example.Orgs2.DAO.Companion.dao
import com.example.Orgs2.databinding.ActivityFormularioBinding
import com.example.Orgs2.databinding.DialogAlertBinding

class FormularioActivity : AppCompatActivity() {

    var url : String? = null
    val binding by lazy {
        ActivityFormularioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.formularioImage.setOnClickListener {
            val binding2 = DialogAlertBinding.inflate(layoutInflater)

            AlertDialog.Builder(this)
                .setView(binding2.root)
                .setPositiveButton("Confirmar", { _, _ ->
                    binding.formularioImage.load(url)
                    binding.formularioImage.refreshDrawableState() })
                .setNegativeButton("Cancelar", { _, _ -> })
                .show()

            Log.i("teste", "$url")
            binding2.dialogButton.setOnClickListener {
                url = binding2.dialogText.text.toString()
                Log.i("teste", "$url")
                binding2.dialogImage.load(url)
                binding2.dialogImage.refreshDrawableState()
            }

        }


        binding.formularioButton.setOnClickListener{
            val nome = binding.formularioNameText.text.toString()
            val descricao = binding.formularioDescText.text.toString()
            val valor = binding.formularioValueText.text.toString().ifBlank { "0.00" }
            val produto = Product(nome, descricao, valor.toDouble(), url)
            Log.i("teste", "$url")
            dao.add(produto)
            finish()
        }





        }
    }
