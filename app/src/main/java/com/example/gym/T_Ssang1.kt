package com.example.gym

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.t_ssang1.*

class T_Ssang1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.t_ssang1)

        val T_Webview = intent.getStringExtra("Re_txt_h")
        val T_Script = intent.getStringExtra("Re_txt_h2")

        t_webView.loadUrl("$T_Webview")
        t_webView.settings.javaScriptEnabled = true
        t_webView.webViewClient = WebViewClient()
        t_webView.webChromeClient = WebChromeClient()

        t_script.setText("$T_Script")

        }
    }
