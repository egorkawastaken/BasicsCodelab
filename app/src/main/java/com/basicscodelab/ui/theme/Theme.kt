package com.basicscodelab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    surface = Blue,
    onSurface = Navy,
    primary = Navy,
    onPrimary = Chartreuse
)

private val LightColorPalette = lightColors(
    primary = LightBlue,
    primaryVariant = Purple700,
    secondary = Teal200,

    background = Color.White,
    surface = Blue,
    onPrimary = Navy,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.White,

    )



@Composable
fun BasicsCodelabTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {

    val systemUiController = rememberSystemUiController()
    val colors = if (darkTheme) {
        systemUiController.setSystemBarsColor(
            color = Color.Black
        )
        DarkColorPalette

    } else {
        systemUiController.setSystemBarsColor(
            color = Color.White
        )
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}