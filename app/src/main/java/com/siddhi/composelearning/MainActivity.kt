package com.siddhi.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var name by remember { mutableStateOf("")  }

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                TextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Enter your name") },
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Hello, $name!",
                    fontSize = 22.sp
                )
            }
        }
    }
}
