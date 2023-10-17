package com.mankelito.keepmylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView


class ListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val buttonAdd = findViewById<Button>(R.id.buttonadd)
        val myList = findViewById<ListView>(R.id.itemlist)
        val myEditText = findViewById<EditText>(R.id.ItemText)
        val buttonback = findViewById<ImageButton>(R.id.backButton)
        var storeButton = findViewById<ImageButton>(R.id.storesButton)

        val arrayAdapter:ArrayAdapter<String>

        val items = mutableListOf<String>()

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
        myList.adapter = arrayAdapter

        buttonAdd.setOnClickListener {
            items.add(myEditText.text.toString())
            arrayAdapter.notifyDataSetChanged()
        }

        storeButton.setOnClickListener{
            val intentInventoryActivity = Intent(this, NearStoresActivity::class.java)
            startActivity(intentInventoryActivity)
        }

        buttonback.setOnClickListener {
            finish()
        }
    }

}