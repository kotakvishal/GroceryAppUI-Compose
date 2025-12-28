package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun CategoryTabRow() {

    val categories = listOf(
        "Deal", "Bakery", "Dairy", "Pizza",
        "Vegetables", "Chicken", "Burger", "Taco", "Subway"
    )

    var selectedIndex by remember { mutableIntStateOf(0) }

    ScrollableTabRow(
        selectedTabIndex = selectedIndex,
        edgePadding = 16.dp,
        containerColor = Color.Transparent,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .tabIndicatorOffset(tabPositions[selectedIndex]),
                height = 3.dp,
                color = Color.LightGray
            )
        }
    ) {

        categories.forEachIndexed { index, title ->

            Tab(
                selected = selectedIndex == index,
                onClick = { selectedIndex = index },
                selectedContentColor = Color.LightGray,
                unselectedContentColor = Color.LightGray
            ) {

                Column(
                    modifier = Modifier.padding(vertical = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .background(
                                if (selectedIndex == index)
                                    Color.LightGray
                                else
                                    Color.DarkGray,
                                CircleShape
                            )
                    )

                    Spacer(Modifier.height(4.dp))

                    Text(
                        text = title,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

