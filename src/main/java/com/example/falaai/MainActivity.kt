package com.example.falaai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FalaAiTheme { // Se o seu tema tiver outro nome, pode usar Surface direto
                PrivacyScreen()
            }
        }
    }
}

@Composable
fun PrivacyScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Logo
            Text(
                text = "💬 Fala.AI",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4A708B),
                modifier = Modifier.padding(top = 16.dp)
            )

            // Conteúdo Central
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "🛡️", fontSize = 100.sp)
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Sua Privacidade\ne Dados",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF333333)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Para transcrever em tempo real, o Fala.AI processa o áudio do seu microfone. Não armazenamos gravações. Seus dados são protegidos.",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
            }

            // Botão e Termos
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row {
                    TextButton(onClick = {}) { Text("Termos de Uso", color = Color.LightGray) }
                    TextButton(onClick = {}) { Text("Privacidade", color = Color.LightGray) }
                }
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(28.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4299E1))
                ) {
                    Text("Aceitar e Continuar", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Tela de Privacidade")
@Composable
fun DefaultPreview() {
    PrivacyScreen()
}

@Composable
fun FalaAiTheme(content: @Composable () -> Unit) {
    MaterialTheme(content = content)
}