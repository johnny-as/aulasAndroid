package com.johnnysouza.notifyvnt

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = NotificationCompat.Builder(this, "canal")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Notificação da Aula 15")
            .setContentText("Essa é sua notificação da Aula 15!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel("canal", "notifyAula15", NotificationManager.IMPORTANCE_DEFAULT).apply {
                description = "Notificação de Mensagem"
            }
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }

        val button = findViewById<Button>(R.id.buttonNotify)
        button.setOnClickListener {

            NotificationManagerCompat.from(this).notify(1 , builder.build())

        }


    }
}


