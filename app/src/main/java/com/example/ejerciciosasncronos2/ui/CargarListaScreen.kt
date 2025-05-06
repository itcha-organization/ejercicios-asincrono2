package com.example.ejerciciosasncronos2.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CargarListaScreen(viewModel: CargarListaViewModel = viewModel()) {
    val lista by viewModel.lista.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            onClick = { viewModel.obtenerDatos() },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Cargar lista")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(lista) { item ->
                Text(text = item, modifier = Modifier.padding(8.dp))
                HorizontalDivider()
            }
        }
    }
}
