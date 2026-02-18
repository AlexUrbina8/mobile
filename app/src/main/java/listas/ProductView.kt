package listas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Preview (showBackground = true)
@Composable
fun ProductPreview () {
    ProductView(imagen = R.drawable.macbook, nombre = "Macbook", calificacion = 5.0f, precio = 3000, entrega = "lues")
}
@Composable
fun ProductView (imagen : Int, nombre : String, calificacion : Float, precio : Int, entrega : String) {
    /*var imagen: Int = R.drawable.alejandromagno
    var nombre : String = "Alejandro Magno"
    var calificacion : Float= 5.0f
    var precio : Int = 13000
    var entrega : String = "lunes" */
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth().padding(12.dp)) {
            Column(modifier = Modifier.fillMaxWidth(0.40f)) {
                Image(painter = painterResource(imagen),
                    contentDescription = "",)
            } // Image
            Column() {
                Spacer(modifier = Modifier.size(10.dp))
                Text(nombre, fontSize = 18.sp)
                Text("${calificacion} estrellas")
                Text("${precio}", fontWeight = FontWeight.Bold)
                Text("Llega el ${entrega}")
                Spacer(modifier = Modifier.size(10.dp))
                Button(onClick = {}) {
                    Text("Agregar al carrito")
                }
            } // Information
        }
    }
}