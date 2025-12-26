package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    NavigationBar {
        bottomNavItems.forEach { item ->
            NavigationBarItem(
                selected = item == selectedItem,
                onClick = { onItemSelected(item) },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(text = item.title)
                }
            )
        }
    }
}

