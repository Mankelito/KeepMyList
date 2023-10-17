package com.mankelito.keepmylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val logButton = findViewById<Button>(R.id.logButton)

        logButton.setOnClickListener{
            val intentMainMenuActivity = Intent(this, MainMenuActivity::class.java)
            startActivity(intentMainMenuActivity)
        }
    }
}