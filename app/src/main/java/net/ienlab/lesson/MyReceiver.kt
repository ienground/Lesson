package net.ienlab.lesson

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "MyReceiver", Toast.LENGTH_SHORT).show()
    }
}