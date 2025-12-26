package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable
fun ProductCard(
    modifier: Modifier = Modifier
) {
    var quantity by remember { mutableIntStateOf(0) }

    Card(
        modifier = modifier.height(180.dp).width(140.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text("Pineapple")
            Spacer(modifier = Modifier.height(8.dp))
            Text("₹33")

            Spacer(modifier = Modifier.weight(1f))

            if (quantity == 0) {
                Button(
                    onClick = { quantity = 1 },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Add to cart")
                }
            } else {
                QuantitySelector(
                    quantity = quantity,
                    onIncrease = { quantity++ },
                    onDecrease = { quantity-- }
                )
            }
        }
    }
}
