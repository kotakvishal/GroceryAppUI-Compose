package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ktk.wishdroid.grocery_app_compose_ui.ui.models.ProductUiModel


@Composable
fun ProductRow(
    products: List<ProductUiModel>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(products.size, key = { it }) { product ->
            ProductCard(product = products[product])
        }
    }
}


