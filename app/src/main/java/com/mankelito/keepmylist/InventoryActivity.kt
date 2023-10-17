package com.mankelito.keepmylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView

class InventoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory)

        val itemList = findViewById<ListView>(R.id.itemList)
        val backbutton = findViewById<ImageButton>(R.id.backbutton)

        val arrayAdapter: ArrayAdapter<String>

        val item1 = Item("Pan", 6)
        val item2 = Item("Leche", 2)
        val item3 = Item("Huevos", 5)

        val items = listOf<Item>(item1, item2, item3)

        val itemsString = mutableListOf<String>()

        for(item in items){
            itemsString.add("${item.nombre} ${item.cantidad}")
        }

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,itemsString)
        itemList.adapter = arrayAdapter

        backbutton.setOnClickListener {
            finish()
        }
    }
}