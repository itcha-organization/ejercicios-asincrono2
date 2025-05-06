package com.example.ejerciciosasncronos2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejerciciosasncronos2.ui.CargarListaScreen
import com.example.ejerciciosasncronos2.ui.theme.EjerciciosAsíncronos2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjerciciosAsíncronos2Theme {
                CargarListaScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjerciciosAsíncronos2Theme {
        CargarListaScreen()
    }
}