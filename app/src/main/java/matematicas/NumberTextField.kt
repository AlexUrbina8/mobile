package matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

// @Preview(showBackground = true)
@Composable
fun NumberTextView(modificador : Modifier) {

    var number by remember {
        mutableStateOf("") }

    Column(modificador.background(Color.Blue)) {
        Text("Ingresa un número")
        TextField(
            value = number,
            onValueChange = { textoEscrito ->
                if (textoEscrito.toIntOrNull() != null || textoEscrito.isEmpty()) {
                    number = textoEscrito
                }
            }
        )
    }
}

@Preview (showBackground = true)
@Composable

fun NumberTextViewPreview () {
    NumberTextView(modificador = Modifier.fillMaxWidth())
}