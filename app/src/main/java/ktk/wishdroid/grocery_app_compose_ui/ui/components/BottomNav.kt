package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomNav() {
    NavigationBar {
        listOf("Home", "Deals", "Seasons", "Health", "For you").forEach {
            NavigationBarItem(
                selected = it == "Home",
                onClick = {},
                icon = { Icon(Icons.Default.Home, null) },
                label = { Text(it) }
            )
        }
    }
}
