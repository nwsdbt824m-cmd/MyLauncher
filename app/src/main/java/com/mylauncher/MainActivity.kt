package com.mylauncher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим нашу кнопку с неоновой иконкой по ID из XML
        val btnApps = findViewById<Button>(R.id.btn_apps)

        // Настраиваем действие при нажатии на кнопку
        btnApps.setOnClickListener {
            // Уникальный ID вашего приложения KIBER RUSSIA
            val gamePackageName = "com.mylauncher" 

            val launchIntent: Intent? = packageManager.getLaunchIntentForPackage(gamePackageName)

            if (launchIntent != null) {
                // Если приложение установлено на телефоне, запускаем его
                startActivity(launchIntent)
            } else {
                // Если приложение не найдено, показываем стильную подсказку
                Toast.makeText(this, "Приложение KIBER RUSSIA не установлено на устройстве", Toast.LENGTH_LONG).show()
            }
        }
    }
}
