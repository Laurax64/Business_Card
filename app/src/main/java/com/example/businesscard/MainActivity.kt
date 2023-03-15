package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.padding(top = 200.dp, bottom = 130.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.android_icon),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
                )
            Text(
                text = stringResource(R.string.name),
                fontSize = 40.sp
            )
            Text(
                text = stringResource(R.string.occupation),
                fontSize = 20.sp
            )
        }

        Column(modifier = Modifier.padding(start = 8.dp, end = 8.dp)) {
            ContactInformation()
        }


    }

}

@Composable
fun ContactInformation() {
    Column() {
        Row() {
            Image(
                painter = painterResource(R.drawable.linkedin_icon),
                contentDescription = null,
                modifier = Modifier.size(50.dp).padding(end = 4.dp)
            )
            Text(
                text = stringResource(R.string.linkedin_link)
            )
        }
        Row() {
            Image(
                painter = painterResource(R.drawable.github_icon),
                contentDescription = null,
                modifier = Modifier.size(50.dp).padding(end = 4.dp)
            )
            Text(
                text = stringResource(R.string.github_link)
            )
        }
        Row() {
            Image(
                painter = painterResource(R.drawable.gmail_icon),
                contentDescription = null,
                modifier = Modifier.size(50.dp).padding(end = 4.dp)
            )
            Text(
                text = stringResource(R.string.gmail_address),
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }
}