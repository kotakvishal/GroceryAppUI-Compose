package ktk.wishdroid.grocery_app_compose_ui.ui.models

import ktk.wishdroid.grocery_app_compose_ui.R

data class CategoryItem(
    val title: String,
    val iconRes: Int
)
val categories = listOf(
    CategoryItem("Deal", R.drawable.ic_pizza),
    CategoryItem("Bakery", R.drawable.ic_pizza),
    CategoryItem("Dairy", R.drawable.ic_pizza),
    CategoryItem("Pizza", R.drawable.ic_pizza),
    CategoryItem("Vegetables", R.drawable.ic_pizza),
    CategoryItem("Chicken", R.drawable.ic_pizza),
    CategoryItem("Burger", R.drawable.ic_pizza),
    CategoryItem("Taco", R.drawable.ic_pizza),
    CategoryItem("Subway", R.drawable.ic_pizza)
)
