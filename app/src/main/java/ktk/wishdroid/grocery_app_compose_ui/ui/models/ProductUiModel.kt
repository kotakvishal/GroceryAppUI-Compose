package ktk.wishdroid.grocery_app_compose_ui.ui.models

import ktk.wishdroid.grocery_app_compose_ui.R

data class ProductUiModel(
    val name: String,
    val price: String,
    val iconRes: Int
)

val topSellingProducts = listOf(
    ProductUiModel(
        name = "Pineapple",
        price = "₹33",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Apple",
        price = "₹120",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Banana",
        price = "₹40",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Orange",
        price = "₹60",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Mango",
        price = "₹90",
        iconRes = R.drawable.ic_pineapple
    )
)
val exploreMoreProducts = listOf(
    ProductUiModel(
        name = "Tomato",
        price = "₹25",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Potato",
        price = "₹20",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Onion",
        price = "₹30",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Capsicum",
        price = "₹50",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Carrot",
        price = "₹45",
        iconRes = R.drawable.ic_pineapple
    ),
    ProductUiModel(
        name = "Cucumber",
        price = "₹35",
        iconRes = R.drawable.ic_pineapple
    )
)
