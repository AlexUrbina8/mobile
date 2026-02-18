package componentes

import android.widget.Button
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable

fun ButtonExample () {
    Box(modifier = Modifier.fillMaxWidth()) {
        Button(onClick = { print("Hello") }) {
            Text("Click me")
        }
    }
}