package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.Calendario
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // Um contêiner de superfície usando a cor 'background' do tema
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    DiaDaSemana()
                }
            }
        }
    }
}

@Composable
fun DiaDaSemana(modifier: Modifier = Modifier) {
    // Calcula o dia da semana atual usando a classe Calendario (não fornecida)
    val hoje = Calendario().diaDASemana()
    Text(
        text = "Dia: $hoje!",
        modifier = modifier
    )
}

@Preview(showBackground = false)
@Composable
fun DiaDaSemanaPreview() {
    // Visualização do composável DiaDaSemana
    MyApplicationTheme {
        DiaDaSemana()
    }
}
