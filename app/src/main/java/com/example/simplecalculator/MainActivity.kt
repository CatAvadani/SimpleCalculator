package com.example.simplecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.simplecalculator.ui.theme.SimpleCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCalculatorTheme {
                val viewModel = viewModels<CalculatorViewModel>()
                val state = viewModel.value.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = state,
                    onAction = {
                       // viewModel:: onAction,
                    },
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier.fillMaxSize()
                        .background(Color.DarkGray)
                        .padding(16.dp)

                )
            }
        }
    }
}

