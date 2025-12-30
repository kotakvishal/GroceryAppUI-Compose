package ktk.wishdroid.grocery_app_compose_ui.ui.models

import androidx.compose.material.icons.filled.*

import androidx.annotation.DrawableRes
import ktk.wishdroid.grocery_app_compose_ui.R

sealed class BottomNavItem(
    val title: String,
    @DrawableRes val iconRes: Int
) {
    object Home : BottomNavItem(
        title = "Home",
        iconRes = R.drawable.ic_home
    )

    object Deals : BottomNavItem(
        title = "Deals",
        iconRes = R.drawable.ic_deal
    )


    object Health : BottomNavItem(
        title = "Health",
        iconRes = R.drawable.ic_health
    )
}

