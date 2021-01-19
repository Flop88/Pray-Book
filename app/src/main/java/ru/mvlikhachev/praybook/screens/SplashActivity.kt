package ru.mvlikhachev.praybook.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.mvlikhachev.praybook.MainActivity
import ru.mvlikhachev.praybook.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(5000)
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    // Open new fragment
                    startActivity(
                        Intent(
                            this@SplashActivity,
                            MainActivity::class.java

                        )
                    )
                }
            }
        }
        thread.start()
    }
}