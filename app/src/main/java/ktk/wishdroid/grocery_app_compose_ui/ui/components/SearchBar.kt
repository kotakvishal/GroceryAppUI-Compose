package ktk.wishdroid.grocery_app_compose_ui.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardVoice
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(
    value: String = "",
    onValueChange: (String) -> Unit = {},
    onVoiceClick: () -> Unit = {}
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = "Search for vegetables",
                color = Color(0xFF9A9A9A)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(14.dp),

        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search",
                tint = Color(0xFFFFFFFF)
            )
        },

        trailingIcon = {
            Icon(
                imageVector = Icons.Filled.KeyboardVoice,
                contentDescription = "Voice search",
                tint = Color(0xFFFFFFFF)
            )
        },

        singleLine = true,

        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color(0xFF3A3A3A),
            unfocusedBorderColor = Color(0xFF2A2A2A),

            focusedContainerColor = Color(0xFF1C1C1E).copy(alpha = 0.85f),
            unfocusedContainerColor = Color(0xFF1C1C1E).copy(alpha = 0.75f),

            cursorColor = Color(0xFFFFFFFF),
            focusedTextColor = Color.White,
            unfocusedTextColor = Color.White
        )
    )
}
