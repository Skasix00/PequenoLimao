package com.example.littlelemonlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemonlogin.ui.theme.LittleLemonLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginScreen()
                }
            }
        }
    }


    @Composable
    @Preview
    fun LoginScreenPreview() {
        LoginScreen()
    }

    @Composable
    fun LoginScreen() {
        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            Row() {
                LoginImage()
            }
            Row() {
                UsernameInput()
            }
            Row() {
                PasswordInput()
            }
            Row() {
                LoginButton()
            }
        }
    }

    @Composable
    fun LoginImage() {
        Image(
            alignment = Alignment.Center,
            painter = painterResource(R.drawable.littlelemonlogo),
            contentDescription = R.string.logo_image.toString()
        )

    }

    @Composable
    fun UsernameInput() {
        var text = ""
        TextField(
            value = text,
            onValueChange = {},
            label = { Text("Username") }
        )
    }

    @Composable
    fun PasswordInput() {
        var text = ""
        TextField(
            value = text,
            onValueChange = {},
            label = { Text("Password") }
        )
    }

    @Composable
    fun LoginButton() {
    }
}
