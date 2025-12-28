package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SectionTitle(
    title: String,
    modifier: Modifier = Modifier,
    dividerColor: Color = Color.White
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            color = Color.White
        )

        Spacer(modifier = Modifier.width(12.dp))

        GradientHorizontalDivider(
            modifier = Modifier
                .weight(1f)
                .height(1.dp),
            colors = listOf(
                dividerColor.copy(alpha = 0.6f),
                dividerColor.copy(alpha = 0f)
            )
        )
    }
}
