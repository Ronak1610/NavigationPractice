package com.example.navpratcoce.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navigateToHome :() -> Unit,popBackStack: () -> Unit)
{
    CenterAlignedTopAppBar(

        title = { Text("Search Screen") },
        actions = { IconButton( onClick = popBackStack)
        { Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "Back")

        }},
        navigationIcon = {
            IconButton(onClick = navigateToHome)
            {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }
        }


        )


}
@Preview
@Composable
fun sasasaxSux()
{
    SearchScreen(navigateToHome = {}, popBackStack = {})
}