package me.valderramasebastian.facebook.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesCount: String = "24",
    commentsCount: String = "3 comentarios",
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // Lado izquierdo: Ícono de Like (círculo azul con manita blanca) + número de likes
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .size(18.dp)
                    .background(color = Color(0xFF1877F2), shape = CircleShape),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = "Me gusta",
                    tint = Color.White,
                    modifier = Modifier.size(10.dp),
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = likesCount,
                fontSize = 13.sp,
                color = Color.Gray,
            )
        }

        // Lado derecho: Número de comentarios
        Text(
            text = commentsCount,
            fontSize = 13.sp,
            color = Color.Gray,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostStatsPreview() {
    PostStats()
}
