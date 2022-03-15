package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                var color by remember { mutableStateOf(Color.Red) }
                Box(Modifier.background(color))

                Button({
                    color = Color((0..255).random(), (0..255).random(), (0..255).random())
                }){
                    Text("Click me!")
                }

                toast("Hi there")
            }
        }
    }
}

fun Activity.toast(msg: String){
    Toast.makeText(this.baseContext, msg, Toast.LENGTH_LONG).show()
}

suspend fun apiCall(query: String): String {
    delay(3000)
    return "result for $query"
}

@Composable
fun Banner(inviteLink: String) {

}