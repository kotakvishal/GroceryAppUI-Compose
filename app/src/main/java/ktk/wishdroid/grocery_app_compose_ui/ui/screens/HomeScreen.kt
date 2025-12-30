package ktk.wishdroid.grocery_app_compose_ui.ui.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ktk.wishdroid.grocery_app_compose_ui.ui.components.BottomNav
import ktk.wishdroid.grocery_app_compose_ui.ui.components.CategoryTabRow
import ktk.wishdroid.grocery_app_compose_ui.ui.components.GradientHorizontalDivider
import ktk.wishdroid.grocery_app_compose_ui.ui.components.ProductGrid
import ktk.wishdroid.grocery_app_compose_ui.ui.components.ProductRow
import ktk.wishdroid.grocery_app_compose_ui.ui.components.PromoBanner
import ktk.wishdroid.grocery_app_compose_ui.ui.components.SearchBar
import ktk.wishdroid.grocery_app_compose_ui.ui.components.SectionTitle
import ktk.wishdroid.grocery_app_compose_ui.ui.components.TopLocationBar
import ktk.wishdroid.grocery_app_compose_ui.ui.models.exploreMoreProducts
import ktk.wishdroid.grocery_app_compose_ui.ui.models.topSellingProducts

@Composable
fun HomeScreen() {
    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = { BottomNav() }
    ) { padding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF121214))
        ) {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.32f)
                    .background(
                        brush = Brush.horizontalGradient(
                            colorStops = arrayOf(
                                0.0f to Color(0x4D3A1620),
                                0.45f to Color(0x803A1620),
                                0.75f to Color(0xCC3A1620),
                                1.0f to Color(0xFF3A1620)
                            )
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.32f)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color(0xFF121214)
                            )
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.18f)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.55f),
                                Color.Black.copy(alpha = 0.25f),
                                Color.Transparent
                            )
                        )
                    )
            )


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
            ) {

                Spacer(modifier = Modifier.height(8.dp))

                TopLocationBar()

                Spacer(modifier = Modifier.height(12.dp))

                SearchBar()

                Spacer(modifier = Modifier.height(16.dp))

                CategoryTabRow()

                Spacer(modifier = Modifier.height(20.dp))

                PromoBanner()

                Spacer(modifier = Modifier.height(24.dp))

                SectionTitle(
                    title = "Top selling fruits",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                ProductRow(
                    products = topSellingProducts,
                    modifier = Modifier.padding(top = 12.dp)
                )

                Spacer(modifier = Modifier.height(28.dp))

                SectionTitle(
                    title = "Explore more",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                ProductGrid(
                    products = exploreMoreProducts,
                    modifier = Modifier.padding(top = 12.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}
