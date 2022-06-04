package com.example.Orgs2

class DAO {

    fun add(produto : Product) {
        dao.add(produto)
    }

    fun search(){
        dao.size
    }
    companion object{
        val dao = mutableListOf<Product>()
    }
}