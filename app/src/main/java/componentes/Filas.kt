package componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun Filas(){

    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically){
        Text("uno")
        VerticalDivider()
        Column() {
            Text("dos")
            Text("cuatro")
            Text("cinco")
            Text("seis")
        }
        VerticalDivider()
        Column() {
            Text("tres")
            Text("", Modifier.fillMaxWidth(1f).background(color = Color.Red))
            Text("", Modifier.fillMaxWidth(1f).background(color = Color.Blue))
        }
    }
}