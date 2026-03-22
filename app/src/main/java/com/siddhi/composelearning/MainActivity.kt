package com.siddhi.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFFDEFF4))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Hello Siddhi",
                    fontSize = 28.sp,
                    color = Color(0xFF6200EE)
                )

                Spacer(modifier = Modifier.height(10.dp))
                
                Text(
                    text = "Welcome to your Compose journey",
                    fontSize = 18.sp,
                    color = Color.DarkGray
                )
            }
        }
    }
}
