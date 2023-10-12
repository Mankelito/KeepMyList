package com.mankelito.keepmylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import kotlin.system.exitProcess

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        val buttonInv = findViewById<Button>(R.id.buttoninventory)
        val buttonList = findViewById<Button>(R.id.buttonlist)
        val buttonLogOut = findViewById<Button>(R.id.buttonlogout)

        buttonInv.setOnClickListener {
            val intentInventoryActivity = Intent(this, InventoryActivity::class.java)
            startActivity(intentInventoryActivity)
        }
        buttonList.setOnClickListener {
            val intentListActivity = Intent(this, ListActivity::class.java)
            startActivity(intentListActivity)
        }
        buttonLogOut.setOnClickListener {
            finish()
        }
    }
}