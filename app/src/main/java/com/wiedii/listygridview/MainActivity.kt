package com.wiedii.listygridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas:ArrayList<Fruta> = ArrayList()

        frutas.add(Fruta("Durazno",R.drawable.durazno))
        frutas.add(Fruta("Manzanas",R.drawable.manzana))
        frutas.add(Fruta("Platano",R.drawable.platano))
        frutas.add(Fruta("Sandia",R.drawable.sandia))


        //val adapter= ArrayAdapter<Fruta>(this,android.R.layout.simple_list_item_1,frutas)
        val adapter= AdapterCustomFrutas(this,frutas)
        listViewFrutas.adapter=adapter

        listViewFrutas.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Eligio la fruta ${frutas[position]}",Toast.LENGTH_LONG).show()

        }

    }

}
