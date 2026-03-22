package com.siddhi.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var message by remember { mutableStateOf("Click the button")  }

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = message,
                    fontSize = 20.sp
                )
                
                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = { message = "You clicked the button" }) {
                    Text(text = "Click me")
                }
            }
        }
    }
}
