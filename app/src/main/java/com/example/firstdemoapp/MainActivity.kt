package com.example.firstdemoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstdemoapp.ui.theme.FirstDemoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload=findViewById<Button>(R.id.btnUpload)
        val buttonDownload=findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading .......", Toast.LENGTH_SHORT).show()

            buttonDownload.setOnClickListener{
                Toast.makeText(applicationContext, "Downloading  .......", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
