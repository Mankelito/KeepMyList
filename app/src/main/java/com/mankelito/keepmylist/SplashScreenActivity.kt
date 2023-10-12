package com.mankelito.keepmylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val buttonnext = findViewById<Button>(R.id.button4)

        buttonnext.setOnClickListener {
            val intentAbout = Intent(this, MainMenuActivity::class.java)
            startActivity(intentAbout)
        }
    }
}