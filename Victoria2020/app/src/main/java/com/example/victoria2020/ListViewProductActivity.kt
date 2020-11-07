package com.example.victoria2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_view_product.*

class ListViewProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_product)

        val producto = Producto("Cámara", 100.0, "Cámara bonita", R.drawable.piedra)
        val producto2 = Producto("Laptop", 100.0, "Laptop bonita", R.drawable.tijeras)
        val producto3 = Producto("Teclado", 100.0, "Teclado bonita", R.drawable.papel)
        val listaProductos = listOf(producto, producto2, producto3)
        val adapter = ProductoAdapter(this, listaProductos)
        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, ProductoActivity::class.java)
            intent.putExtra("producto", listaProductos[position])
            startActivity(intent)
        }
    }

}