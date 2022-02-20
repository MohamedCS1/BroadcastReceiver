package com.example.broadcastsreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.broadcastsreciver.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val brodacastreceiver = BroadcastBootCompleted()
        val intentfilter = IntentFilter(Intent.ACTION_BOOT_COMPLETED)

        registerReceiver(brodacastreceiver ,intentfilter)
    }
}