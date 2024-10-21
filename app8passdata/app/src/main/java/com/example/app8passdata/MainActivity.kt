package com.example.app8passdata

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app8passdata.ui.theme.App8passDataTheme
import org.xml.sax.HandlerBase

class MainActivity : ComponentActivity() {

    companion object {
        const val KEY = "com.example.app8passdata.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

        Handler().postDelayed({
            val intent = Intent(this, takeOrder::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}


