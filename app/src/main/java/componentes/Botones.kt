package componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Botones() {
    var activo by remember {
        mutableStateOf(false)
    }
    var texto by remember { mutableStateOf("Te amo Gigi") }
    fun cambiartext () {
        if (activo) {
            texto = "Amo a mi novia"
        } else {
            texto = "Te amo GIGI"
        }
        activo = !activo
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = texto)
        Button(
            onClick = {
                cambiartext()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text("Click me!")
        }
    }
}