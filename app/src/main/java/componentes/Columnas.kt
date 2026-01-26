package componentes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Preview (showBackground = true)
@Composable
fun Columnas() {
    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize().background(Color.Red).padding(end = 20.dp),
        horizontalAlignment = Alignment.End) {
        Text("Hola")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Adios")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Tajin ❤️")
    }
}


@Preview (showBackground = true)
@Composable
fun Separadores () {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Alex Chiquito", modifier = Modifier.fillMaxSize().weight(0.25f))
        HorizontalDivider(thickness = 20.dp, color = Color.Blue)
        Text("Lina Isabela", modifier = Modifier.fillMaxSize().weight(0.50f))
        Text("Alejandra", modifier = Modifier.fillMaxSize().weight(0.25f))
        Columnas()
    }
}