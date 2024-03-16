package uz.ssh.justfun

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        findViewById<AppCompatButton>(R.id.button).setOnClickListener {>()

        findViewById<Button>(R.id.books).setOnClickListener {
            var intent = Intent(this, Books::class.java)
            startActivity(intent)
        };


    }


}