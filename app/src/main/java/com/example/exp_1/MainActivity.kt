package com.example.exp_1

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "ActivityLifecycle"

    private lateinit var txtLifecycle: TextView

    private fun showMessage(message: String) {

        txtLifecycle.text = message

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        Log.d(TAG, message)

        // Keep the message on screen for 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            txtLifecycle.text = ""
        }, 2000)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        txtLifecycle = findViewById(R.id.txtLifecycle)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        val txt = findViewById<TextView>(R.id.txtMessage)
        val btn = findViewById<Button>(R.id.btnChange)

        btn.setOnClickListener {

            txt.text = "Welcome to MAD Lab"

            txt.setTextColor(Color.RED)

            txt.textSize = 30f

            txt.setBackgroundColor(Color.YELLOW)

            btn.text = "UI Changed"

            Toast.makeText(this, "UI Updated Successfully", Toast.LENGTH_SHORT).show()
        }

        showMessage("onCreate()")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart()")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume()")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause()")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy()")
    }
}