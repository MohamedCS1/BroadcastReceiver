package com.example.broadcastsreceiver

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.broadcastsreciver.R

class BroadcastBootCompleted: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context ,"RECEIVED" , Toast.LENGTH_LONG).show()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            val channel = NotificationChannel("13" ,"Notification Channel" , NotificationManager.IMPORTANCE_HIGH)

            val nm = context!!.getSystemService(NotificationManager::class.java)

            nm.createNotificationChannel(channel)

        }

        val notification = NotificationCompat.Builder(context!!,"13")

        val nm = NotificationManagerCompat.from(context)

        notification.setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentText("Screen On")
            .setStyle(NotificationCompat.BigTextStyle())
            .setContentTitle("Broadcast Receiver")

        nm.notify(19 ,notification.build())
    }


}