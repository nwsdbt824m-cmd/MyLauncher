package com.mylauncher

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ServersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servers)

        val serverKalimangi = findViewById<LinearLayout>(R.id.server_kalimangi)

        serverKalimangi.setOnClickListener {
            // Переходим с экрана серверов на экран ввода логина/пароля
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

