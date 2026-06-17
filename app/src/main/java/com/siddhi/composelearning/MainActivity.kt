package com.siddhi.composelearning

import android.os.*
import androidx.activity.*
import androidx.activity.compose.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var task by remember { mutableStateOf("") }
            val taskList = remember { mutableStateListOf<String>() }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

                Row {
                    TextField(
                        value = task,
                        onValueChange = { task = it },
                        modifier = Modifier.weight(1f),
                        label = { Text("Enter task") }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Button(onClick = {
                        if (task.isNotEmpty()) {
                            taskList.add(task)
                            task = ""
                        }
                    }) {
                        Text("Add")
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                LazyColumn {
                    items(taskList) { item ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {
                            Text(
                                text = item,
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
