package com.android_lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixLetterTheme {
                GreetingImage(
                    message = stringResource(R.string.king_message_text),
                    from = "From King Arthur",
                    modifier = Modifier.padding(all=8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RoyalInvitationPreview() {
    PixLetterTheme {
        GreetingImage(
            message = stringResource(R.string.king_message_text),
            from = "From King Arthur")
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .border(
                width = 2.dp,
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp)

    ) {
        InvitationTitle()
        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            //color = Color.White

        )
        Text(
            text = from,
            fontSize = 24.sp,
            //color = Color.White,
            modifier = Modifier
                .padding(all = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.pixelcasstle)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            alpha = 0.8F,
            modifier = Modifier.fillMaxSize(),
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 8.dp)
        )
    }
}

@Composable
fun InvitationTitle(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.invitation_title),
        fontSize = 28.sp,
        color = Color.Yellow,
        textAlign = TextAlign.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    )
}