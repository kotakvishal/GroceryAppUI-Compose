package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ktk.wishdroid.grocery_app_compose_ui.R

@Composable
fun PromoBanner() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(130.dp)
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(0xFF00401B),
                        Color(0xFF022816),
                        Color(0xFF2A3713)
                    ),
                    radius = 600f
                ),
                shape = RoundedCornerShape(18.dp)
            )
            .padding(16.dp)
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(0.7f)
        ) {
            Text(
                text = "Shop Your Favorite Groceries\nQuickly & Affordably!",
                color = Color.White,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF1F7A3F)
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("Grab offers")
            }
        }

        Image(
            painter = painterResource(id = R.drawable.ic_fruits),
            contentDescription = "Fruits",
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .height(200.dp),
            contentScale = ContentScale.FillWidth
        )
    }
}
