package com.example.navpratcoce.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HUI(navigateToSearch :() -> Unit,popBackStack: () -> Unit)
{
    Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Button(onClick = navigateToSearch) {
            Text(text = "Search")
        }
        Button(onClick = popBackStack)
        { Text(text = "Back") }


    }
}
@Preview(showBackground = true)
@Composable
fun huq()
{
    HUI(navigateToSearch = {}, popBackStack = {})
}