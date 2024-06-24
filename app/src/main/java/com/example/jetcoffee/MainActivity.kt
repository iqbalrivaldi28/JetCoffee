package com.example.jetcoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetcoffee.ui.component.Search
import com.example.jetcoffee.ui.theme.JetCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetCoffeeTheme {
                JetCoffeeApp()
            }
        }
    }
}

@Composable
fun JetCoffeeApp() {
    Column {
        Banner()
    }
}


@Composable
fun Banner(
    modifier: Modifier = Modifier
) {
    Box (
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "Bannar Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(160.dp)
        )
        Search()
    }
}


@Preview(showBackground = true)
@Composable
private fun JetCoffeeAppPrev() {
    JetCoffeeApp()
}