package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HAPPYBIRTHDAYTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HAPPYBIRTHDAYTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Birthgreetim("Happy Birthday Pratham", "~ Sannidhya")
                }
            }
        }
    }
}
@Composable
fun Birthgreet(to: String, from: String){
    Column() {
        Text(text = to, fontSize = 36.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(start = 16.dp, top = 16.dp)

        )
        Text(text = from, fontSize = 20.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.End)
            .padding(end = 26.dp, top = 16.dp)
        )

    }
}
@Composable
fun Birthgreetim(to: String, from: String){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Birthgreet(to = to, from = from )
    }

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HAPPYBIRTHDAYTheme {
        Birthgreetim("Happy Birthday Pratham", "~ Sannidhya")
    }
}