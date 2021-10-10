package com.niforances.bloom_compose.ui.composable

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.elevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.niforances.bloom_compose.R
import com.niforances.bloom_compose.ui.theme.*

@Composable
fun WelcomeScreen() {
    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .padding(top = 72.dp)
                .fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.ic_dark_welcome_bg else R.drawable.ic_light_welcome_bg),
                contentDescription = "welcome background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    modifier = Modifier.padding(start = 88.dp),
                    painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.ic_dark_welcome_illos else R.drawable.ic_light_welcome_illos),
                    contentDescription = "welcome ilLos image",
                    contentScale = ContentScale.Crop,
                )
                Image(
                    modifier = Modifier
                        .padding(top = 48.dp)
                        .fillMaxWidth(),
                    painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.ic_dark_logo else R.drawable.ic_light_logo),
                    contentDescription = "welcome logo",

                    )
                Text(
                    text = "Beautiful home garden solutions",
                    Modifier.paddingFromBaseline(top = 32.sp, bottom = 0.sp),
                    style = Typography.subtitle1,
                    color = if (isSystemInDarkTheme()) White else Gray
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 40.dp, start = 16.dp, end = 16.dp)
                        .height(48.dp)
                        .fillMaxWidth(),
                    shape = Shapes.medium,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isSystemInDarkTheme()) Green300 else Pink900
                    )
                ) {
                    Text(
                        text = "Create account",
                        style = Typography.button,
                        color = if (isSystemInDarkTheme())
                            Gray else White
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(top = 8.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent
                    ),
                    elevation = ButtonDefaults.elevation(0.dp, 0.dp)
                ) {
                    Text(
                        text = "Log in",
                        style = Typography.button,
                        color = if (isSystemInDarkTheme())
                            White else Pink900
                    )
                }
            }
        }
    }
}

@Preview(
    name = "Light Mode",
    showBackground = true
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun DefaultPreview() {
    BloomComposeTheme {
        WelcomeScreen()
    }
}