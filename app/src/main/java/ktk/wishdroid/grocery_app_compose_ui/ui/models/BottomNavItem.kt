package ktk.wishdroid.grocery_app_compose_ui.ui.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomNavItem(
        title = "Home",
        icon = Icons.Filled.Home
    )

    object Deals : BottomNavItem(
        title = "Deals",
        icon = Icons.Filled.LocalOffer
    )

    object Seasons : BottomNavItem(
        title = "Seasons",
        icon = Icons.Filled.Event
    )

    object Health : BottomNavItem(
        title = "Health",
        icon = Icons.Filled.Favorite
    )
}
