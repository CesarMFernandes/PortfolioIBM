package com.example.meuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meuapp.ui.theme.MeuAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeuAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    appLogin()
                }
            }
        }
    }
}

@Composable
fun appLogin(){
    Column(
        Modifier
            .fillMaxWidth()


    ){
        Row(
            Modifier
                .fillMaxWidth()
                .padding(50.dp),
            Arrangement.Center
        ){
            Text("App Login")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            Arrangement.Center
        ){
            TextField(
                value="Nome:",
                onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp),
            Arrangement.Center
        ){
            TextField(
                value="Senha:",
                onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            Arrangement.Center

        ){
            Button(
                onClick={}
            ){
                Text("Cadastrar")
            }
        }
    }
}
@Preview
@Composable
fun appLoginPreview(){
    appLogin()
}
