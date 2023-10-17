package com.mankelito.keepmylist
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView

class NearStoresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nearstores)

        var liststores = findViewById<ListView>(R.id.storeList)
        val buttonback = findViewById<ImageButton>(R.id.backbutton)

        val store1 = Store("Faro Norte", "963841928")
        val store2 = Store("Camilito", "992756293")

        val arrayAdapter: ArrayAdapter<String>

        val stores =listOf(store1, store2)

        val stringlist = mutableListOf<String>()

        for(store in stores){
            stringlist.add("${store.nombre} ${store.numero}")
        }

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,stringlist)
        liststores.adapter = arrayAdapter


        buttonback.setOnClickListener {
            finish()
        }
    }



}