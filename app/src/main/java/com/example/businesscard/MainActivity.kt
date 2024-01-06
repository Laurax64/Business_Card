package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colors.background
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

/**
 * Displays the Business Card app screen
 */
@Composable
fun BusinessCardScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = painterResource(R.drawable.android_icon),
            contentDescription = "Android Icon",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = stringResource(R.string.name),
            fontSize = 40.sp
        )
        Text(
            text = stringResource(R.string.occupation),
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(150.dp))
        ContactInformation()
    }
}

/**
 * Displays the contact information
 */
@Composable
fun ContactInformation() {
    Row {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.linkedin_icon),
                    contentDescription = "Linkedin icon",
                    modifier = Modifier.size(50.dp).padding(end = 4.dp)
                )
                Text(text = stringResource(R.string.linkedin_link), fontSize = 15.sp)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.github_icon),
                    contentDescription = "Github icon",
                    modifier = Modifier.size(50.dp).padding(end = 4.dp)
                )
                Text(text = stringResource(R.string.github_link), fontSize = 15.sp)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.gmail_icon),
                    contentDescription = "Gmail icon",
                    modifier = Modifier.size(50.dp).padding(end = 4.dp)
                )
                Text(text = stringResource(R.string.gmail_address), fontSize = 15.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}