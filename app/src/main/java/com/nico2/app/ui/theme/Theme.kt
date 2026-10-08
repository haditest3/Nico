package com.nico2.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val NikoDarkColorScheme = darkColorScheme(
    background = Color(0xFF101010),
    onBackground = Color(0xFFF5F5F5),
    surface = Color(0xFF101010),
    onSurface = Color(0xFFF5F5F5),
)

@Composable
fun NikoTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = NikoDarkColorScheme,
        content = content,
    )
}
