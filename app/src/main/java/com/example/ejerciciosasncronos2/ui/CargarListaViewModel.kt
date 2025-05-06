package com.example.ejerciciosasncronos2.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CargarListaViewModel : ViewModel() {

    private val _lista = MutableStateFlow<List<String>>(emptyList())
    val lista: StateFlow<List<String>> = _lista

    fun obtenerDatos() {
        viewModelScope.launch {
            _lista.value = cargarDatos()
        }
    }

    suspend fun cargarDatos(): List<String> {
        delay(2000)
        return listOf("Elemento 1", "Elemento 2", "Elemento 3")
    }
}
