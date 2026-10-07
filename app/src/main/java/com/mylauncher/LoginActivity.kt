package com.mylauncher

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

        btnLogin.setOnClickListener {
            val nickname = etNickname.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (nickname.isEmpty() || password.isEmpty()) {
                // Если какое-то поле пустое, ругаемся
                Toast.makeText(this, "Пожалуйста, заполните все поля!", Toast.LENGTH_SHORT).show()
            } else {
                // Имитация успешного входа
                Toast.makeText(this, "Привет, $nickname! Подключаемся к Kalimangi...", Toast.LENGTH_LONG).show()
            }
        }
    }
}
