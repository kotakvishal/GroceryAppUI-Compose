package ktk.wishdroid.grocery_app_compose_ui.ui.models

import ktk.wishdroid.grocery_app_compose_ui.R

data class CategoryItem(
    val title: String,
    val iconRes: Int
)
val categories = listOf(
    CategoryItem("Bakery", R.drawable.ic_bread),
    CategoryItem("Dairy", R.drawable.ic_dairy),
    CategoryItem("Pizza", R.drawable.ic_pizza),
    CategoryItem("Vegetables", R.drawable.ic_veg),
    CategoryItem("Chicken", R.drawable.ic_chicken),
    CategoryItem("Burger", R.drawable.ic_burger),
    CategoryItem("Taco", R.drawable.ic_taco),
    CategoryItem("Wraps", R.drawable.ic_wraps)
)
