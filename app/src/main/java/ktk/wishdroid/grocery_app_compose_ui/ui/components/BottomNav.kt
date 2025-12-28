package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ktk.wishdroid.grocery_app_compose_ui.ui.models.BottomNavItem
val bottomNavItems = listOf(
    BottomNavItem.Home,
    BottomNavItem.Deals,
    BottomNavItem.Seasons,
    BottomNavItem.Health,
)

@Composable
fun BottomNav(
    selectedItem: BottomNavItem = BottomNavItem.Home,
    onItemSelected: (BottomNavItem) -> Unit = {}
) {

    Box {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(96.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color(0xFF0E0E0E)
                        )
                    )
                )
                .align(Alignment.BottomCenter)
        )

        NavigationBar(
            containerColor = Color(0xFF0E0E0E),
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            bottomNavItems.forEach { item ->

                val selected = item == selectedItem

                NavigationBarItem(
                    selected = selected,
                    onClick = { onItemSelected(item) },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = if (selected)
                                Color(0xFF2FAE60)
                            else
                                Color.Gray
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = if (selected)
                                Color(0xFF2FAE60)
                            else
                                Color.Gray,
                            fontSize = 12.sp
                        )
                    }
                )
            }
        }
    }
}


