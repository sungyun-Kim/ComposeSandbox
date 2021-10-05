package com.niforances.bloom_compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.niforances.bloom_compose.R

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_bold),
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 18.sp
    ),
    h2 = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_bold),
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.15.sp,
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_light),
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_light),
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_light),
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_semi_bold),
        fontWeight = FontWeight.Normal,
        letterSpacing = 1.sp,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontStyle = FontStyle(R.font.nunito_sans_semi_bold),
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        fontSize = 12.sp
    ),


    )