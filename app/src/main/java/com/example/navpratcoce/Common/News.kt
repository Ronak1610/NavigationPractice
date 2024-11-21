package com.example.navpratcoce.Common

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Default(text1: String,onClick : ()-> Unit)
{
    Button(
        onClick = onClick,
        modifier = Modifier.size(width = 200.dp, height = 40.dp)

    )
    {  Text(text = text1, fontSize = 10.sp, )}

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview()
{


}