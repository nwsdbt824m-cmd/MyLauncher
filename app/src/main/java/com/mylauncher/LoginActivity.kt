package com.mylauncher

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etNickname = findViewById<EditText>(R.id.et_nickname)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        // 1. Открываем хранилище памяти телефона для нашего лаунчера
        val sharedPreferences = getSharedPreferences("KiberRussiaPrefs", Context.MODE_PRIVATE)

        // 2. Проверяем, есть ли уже сохраненный никнейм. Если есть — сразу подставляем его на экран
        val savedNickname = sharedPreferences.getString("saved_nickname", "")
        if (!savedNickname.isNullOrEmpty()) {
            etNickname.setText(savedNickname)
        }

        btnLogin.setOnClickListener {
            val nickname = etNickname.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (nickname.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Пожалуйста, заполните все поля!", Toast.LENGTH_SHORT).show()
            } else {
                // 3. Если поля заполнены, сохраняем никнейм в память телефона перед входом
                sharedPreferences.edit().putString("saved_nickname", nickname).apply()

                Toast.makeText(this, "Привет, $nickname! Сохранено. Подключаемся к Kalimangi...", Toast.LENGTH_LONG).show()
            }
        }
    }
}
