package ktk.wishdroid.grocery_app_compose_ui.ui.models

data class ProductUiModel(
    val id: Int,
    val name: String,
    val price: String
)
val topSellingProducts = listOf(
    ProductUiModel(1, "Pineapple", "₹33"),
    ProductUiModel(2, "Apple", "₹120"),
    ProductUiModel(3, "Banana", "₹40"),
    ProductUiModel(4, "Orange", "₹60"),
    ProductUiModel(5, "Mango", "₹90")
)

val exploreMoreProducts = listOf(
    ProductUiModel(6, "Tomato", "₹25"),
    ProductUiModel(7, "Potato", "₹20"),
    ProductUiModel(8, "Onion", "₹30"),
    ProductUiModel(9, "Capsicum", "₹50"),
    ProductUiModel(10, "Carrot", "₹45"),
    ProductUiModel(11, "Cucumber", "₹35")
)
