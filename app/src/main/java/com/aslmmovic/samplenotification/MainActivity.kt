package com.aslmmovic.samplenotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aslmmovic.notify.Notify
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {

    private lateinit var notify: Notify
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notify = Notify()
        notify.getToken(this@MainActivity)
        Notify.sendTokenToWebService(this@MainActivity)

    }
}
