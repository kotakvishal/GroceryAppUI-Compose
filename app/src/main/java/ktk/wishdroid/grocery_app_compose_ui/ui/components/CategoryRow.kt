package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ktk.wishdroid.grocery_app_compose_ui.ui.models.categories

@Composable
fun CategoryTabRow() {

    var selectedIndex by remember { mutableIntStateOf(0) }

    val maroon = Color(0xFF7B1E2B)
    val maroonLight = Color(0xFF9C2D3A)

    ScrollableTabRow(
        selectedTabIndex = selectedIndex,
        edgePadding = 16.dp,
        containerColor = Color.Transparent,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .tabIndicatorOffset(tabPositions[selectedIndex]),
                height = 3.dp,
                color = maroon
            )
        },
        divider = {}
    ) {

        categories.forEachIndexed { index, category ->

            val isSelected = selectedIndex == index

            Tab(
                selected = isSelected,
                onClick = { selectedIndex = index },
                interactionSource = remember { MutableInteractionSource() },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Gray
            ) {

                Column(
                    modifier = Modifier.padding(vertical = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .background(
                                if (isSelected) maroon else Color(0xFF2A2A2A),
                                CircleShape
                            )
                    ) {

                        Icon(
                            painter = painterResource(category.iconRes),
                            contentDescription = category.title,
                            tint = Color.Unspecified,
                            modifier = Modifier.wrapContentSize()
                        )

                    }

                    Spacer(Modifier.height(6.dp))

                    Text(
                        text = category.title,
                        fontSize = 12.sp,
                        color = if (isSelected) Color.White else Color.Gray
                    )
                }
            }
        }
    }
}
