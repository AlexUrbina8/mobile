package componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R

@Preview (showBackground = true)
@Composable

fun Imagenes () {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.alejandromagno),
            contentDescription = "Alejandro Magno", modifier = Modifier.size(400.dp).clip(
                CircleShape
            ),
            contentScale = ContentScale.FillWidth)
        Icon(painter = painterResource(R.drawable.baseline_cookie_24),
            contentDescription = "Cookie", modifier = Modifier.size(100.dp),
            tint = Color(0xFF703F25)
        )
    }
}