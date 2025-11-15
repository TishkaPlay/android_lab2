package com.android_lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android_lab2.ui.theme.PixLetterTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixLetterTheme {
                GreetingImage(message = "Royal Decree!\n" +
                        "Dear my Friend,\n" +
                        "His Majesty the King\n" +
                        "Invites you to a great feast!\n" +
                        "Come to the castle before sunset,\n" +
                        "otherwise, you risk losing your head!", from = "From King Arthur", modifier = Modifier.padding(all=8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RoyalInvitationPreview() {
    PixLetterTheme {
        GreetingImage(
            message = "Royal Decree!\n" +
            "Dear my Friend,\n" +
            "His Majesty the King\n" +
            "Invites you to a great feast!\n" +
            "Come to the castle before sunset,\n" +
            "otherwise, you risk losing your head!", from = "From King Arthur")
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all=16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.i__1_)
    Image(
        painter = image,
        contentDescription = null
    )
}
//конец 7 страница