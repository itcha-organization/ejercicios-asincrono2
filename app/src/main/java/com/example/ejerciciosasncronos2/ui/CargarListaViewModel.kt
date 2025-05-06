package com.example.ejerciciosasncronos2.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CargarListaViewModel : ViewModel() {

    var lista by mutableStateOf<List<String>>(emptyList())
        private set

    fun obtenerDatos() {
        lista = listOf("Elemento 1", "Elemento 2", "Elemento 3")
    }
}
