package com.example.cs330_oktobar2023v2.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllPlayScreen(
    vm: AllPlayViewModel = hiltViewModel(),
    navController: NavController
){
    Scaffold(modifier = Modifier.padding(PaddingValues(10.dp)),
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        }) {
        LazyColumn(modifier = Modifier.padding(PaddingValues(5.dp))
        ){
            item {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top=25.dp),
                ){
                    Text(text = "Play Time",
                        fontSize = 25.sp,
                        textAlign = TextAlign.Start)
                }

            }

            vm.state.value.playItems.let {
                items(it) {
                        play->
                    PlayItem(play =play, navController)
                }
            }
        }
    }
}
