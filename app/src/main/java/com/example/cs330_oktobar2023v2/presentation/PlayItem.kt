package com.example.cs330_oktobar2023v2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cs330_oktobar2023v2.R
import com.example.cs330_oktobar2023v2.domain.model.Evidence
import com.example.cs330_oktobar2023v2.domain.model.Play

@Composable
fun PlayItem(play: Play, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            //.clickable { navController.navigate(Screen.FilmDetailScreen.route + "/${film.id}") }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = play.image),
                contentDescription = "circle",
                modifier = Modifier
                    .size(50.dp)
            )
            Column(
                modifier = Modifier
                    .padding(start = 8.dp, end = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = play.name,
                    fontSize = 18.sp
                )

            }
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .width(80.dp)
            ) {
                Text(
                    text = play.quantity.toString(),
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}