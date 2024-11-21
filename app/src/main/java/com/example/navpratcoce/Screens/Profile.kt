package com.example.navpratcoce.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import com.example.navpratcoce.Common.Default

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navigateToProfile : ()-> Unit,popBackStack: () -> Unit)
{
   CenterAlignedTopAppBar(
       title = { Text("Profile Screen") },
       actions = { IconButton(onClick = popBackStack)  {

           Icon(Icons.Filled.Done, contentDescription = "Done")
       }},
       modifier = Modifier.background(color = Color.Red),



   )
  Column (modifier = Modifier
      .fillMaxSize()
      .wrapContentSize(align = Alignment.Center)){
       Card(modifier = Modifier.size(width = 200.dp, height = 200.dp),
           elevation = CardDefaults.elevatedCardElevation(4.dp),
           onClick = navigateToProfile) {

           Column(modifier = Modifier.fillMaxSize(),
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally)
           { Text("Profile Screen") }

       }
  }
}

@Preview(showBackground = true)
@Composable
fun saxSux()
{
    ProfileScreen(navigateToProfile={},popBackStack = {})
}