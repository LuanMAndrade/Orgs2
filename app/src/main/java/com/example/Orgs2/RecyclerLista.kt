package com.example.Orgs2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load


class RecyclerLista(private val context: Context, private val lista: MutableList<Product>) :
    RecyclerView.Adapter<RecyclerLista.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(produto: Product) {

            itemView.findViewById<TextView>(R.id.produtoNome).text = produto.name
            itemView.findViewById<TextView>(R.id.produtoDesc).text = produto.desc
            itemView.findViewById<TextView>(R.id.produtoValor).text = produto.valor.toString()
            itemView.findViewById<ImageView>(R.id.produtoImagem).load(produto.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerLista.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.produto, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerLista.ViewHolder, position: Int) {
        holder.vincula(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }


}
