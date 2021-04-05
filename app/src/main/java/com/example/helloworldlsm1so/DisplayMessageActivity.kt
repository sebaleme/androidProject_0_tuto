package com.example.helloworldlsm1so

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView)
        if ((message == "dorianbuttonGuldo") || (message == "DorianbuttonGuldo")||(message == "sebastienbuttonVegeta") || (message == "SebastienbuttonVegeta"))
        {
            textView.text = "Bravo, c est correct!!"
        }
        else if ((message == "dorianbuttonVegeta") || (message == "DorianbuttonVegeta")||(message == "sebastienbuttonGuldo") || (message == "SebastienbuttonGuldo"))
        {
            textView.text = "Non, ca ne correspond pas."
        }
        else
        {
            textView.text = "Desole, je ne connais pas cette personne."
        }

    }
}