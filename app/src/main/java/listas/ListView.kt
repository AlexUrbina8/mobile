package listas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviles.R

@Preview (showBackground = true)
@Composable

fun ListView () {
    Column( modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "Lunes")
        ProductView(imagen = R.drawable.alejandromagno, nombre = "Alejandro Magno", calificacion = 3.0f, precio = 1000, entrega = "Viernes")
        ProductView(imagen = R.drawable.juliocesar, nombre = "Julio Cesar", calificacion = 3.0f, precio = 6000, entrega = "Martes")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
        ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
    }
}