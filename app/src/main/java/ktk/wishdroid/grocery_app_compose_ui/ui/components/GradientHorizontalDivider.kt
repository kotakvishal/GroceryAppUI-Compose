package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun GradientHorizontalDivider(
    modifier: Modifier = Modifier,
    height: Dp = 1.dp,
    colors: List<Color> = listOf(
        Color.Transparent,
        Color.Gray,
        Color.Transparent
    )
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .background(
                brush = Brush.horizontalGradient(colors)
            )
    )
}
