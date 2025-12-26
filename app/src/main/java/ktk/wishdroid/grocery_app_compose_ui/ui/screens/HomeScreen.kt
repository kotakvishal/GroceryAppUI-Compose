package ktk.wishdroid.grocery_app_compose_ui.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ktk.wishdroid.grocery_app_compose_ui.ui.components.BottomNav
import ktk.wishdroid.grocery_app_compose_ui.ui.components.CategoryTabRow
import ktk.wishdroid.grocery_app_compose_ui.ui.components.ProductRow
import ktk.wishdroid.grocery_app_compose_ui.ui.components.PromoBanner
import ktk.wishdroid.grocery_app_compose_ui.ui.components.SearchBar
import ktk.wishdroid.grocery_app_compose_ui.ui.components.SectionTitle
import ktk.wishdroid.grocery_app_compose_ui.ui.components.TopLocationBar

@Composable
fun HomeScreen() {
    Scaffold(
        containerColor = Color(0xFF0E0E0E),
        bottomBar = { BottomNav() }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            item { TopLocationBar() }
            item { SearchBar() }
            item { CategoryTabRow() }
            item { PromoBanner() }
            item { SectionTitle("Top selling fruits") }
            item { ProductRow() }
        }
    }
}
