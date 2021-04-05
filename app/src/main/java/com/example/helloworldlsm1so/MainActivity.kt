package com.example.helloworldlsm1so

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.helloworldlsm1so.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /** Called when the user taps the Send button */
    fun sendMessageGuldo(view: View) {
        val editText = findViewById<EditText>(R.id.editTextPersonName)
        val message = editText.text.toString() + "buttonGuldo"
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Called when the user taps the Send button */
    fun sendMessageVegeta(view: View) {
        val editText = findViewById<EditText>(R.id.editTextPersonName)
        val message = editText.text.toString()  + "buttonVegeta"
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}