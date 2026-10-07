package com.mylauncher

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ServersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servers)

        // Находим карточку вашего единственного сервера
        val serverKalimangi = findViewById<LinearLayout>(R.id.server_kalimangi)

        serverKalimangi.setOnClickListener {
            Toast.makeText(this, "Подключение к серверу KALIMANGI...", Toast.LENGTH_SHORT).show()
        }
    }
}
