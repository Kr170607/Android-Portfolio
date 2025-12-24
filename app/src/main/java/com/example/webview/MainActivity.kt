package com.example.webview

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


private const val URL = "https://kr170607.github.io/25A03046/"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val wevVariable = findViewById<WebView>(R.id.webview)
        webviewSetUp(wevVariable)




    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun webviewSetUp(webView: WebView){
            webView.webViewClient= WebViewClient()

        webView.apply{
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true
            loadUrl(URL)
        }
    }

}