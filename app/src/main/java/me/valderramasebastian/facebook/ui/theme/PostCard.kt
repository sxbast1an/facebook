package me.valderramasebastian.facebook.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import me.valderramasebastian.facebook.ui.PostHeader

@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    postText: String = "por fin termine la pantalla de login compose",
    imageUrl: String = "https://picsum.photos/600/400",
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            // Encabezado de la publicación
            PostHeader()

            // Texto de la publicación
            Text(
                text = postText,
                fontSize = 15.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            )

            // Imagen cargada desde URL usando la librería Coil
            AsyncImage(
                model = imageUrl,
                contentDescription = "Imagen de la publicación",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            )

            // Estadísticas (Likes y Comentarios)
            PostStats()

            HorizontalDivider(
                thickness = 0.5.dp,
                color = Color.LightGray,
                modifier = Modifier.padding(horizontal = 12.dp),
            )

            // Acciones (Me gusta, Comentar, Compartir)
            PostAction()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    PostCard()
}
