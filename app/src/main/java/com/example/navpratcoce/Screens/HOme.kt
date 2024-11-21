package com.example.navpratcoce.Screens
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navpratcoce.Common.Default


@Composable
fun HOmeScreen(navigateToLogin : ()-> Unit,
               navigateToProfile : ()-> Unit,
               navigateToSearch : ()-> Unit)
{

   Column(modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(align = Alignment.Center)
    )
    {
            Default(text1 = "Login" , onClick = navigateToLogin)
            Spacer(modifier = Modifier.height(10.dp))
            Default(text1 = "Profile", onClick = navigateToProfile)
            Spacer(modifier = Modifier.height(10.dp))
            Default(text1 = "Search", onClick = navigateToSearch)

    }


}
@Preview(showBackground = true)
@Composable
fun Chingpong()
{
HOmeScreen(navigateToSearch = {}, navigateToProfile = {}, navigateToLogin = {})

}