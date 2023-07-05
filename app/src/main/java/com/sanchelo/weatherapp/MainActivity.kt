package com.sanchelo.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sanchelo.weatherapp.presentation.theme.WeatherAppTheme
import com.sanchelo.weatherapp.presentation.views.WeatherCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                WeatherCard()
            }
        }
    }
}
