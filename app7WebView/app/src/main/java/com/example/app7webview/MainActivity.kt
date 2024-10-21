package com.example.app7webview

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app7webview.ui.theme.App7WebViewTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

        val webviewVariable = findViewById<WebView>(R.id.webView)
        webViewSetUp(webviewVariable)


    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(a: WebView){
        a.webViewClient= WebViewClient()

        a.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true
            loadUrl("https://sachinanlyst.netlify.app")
        }
    }
}
