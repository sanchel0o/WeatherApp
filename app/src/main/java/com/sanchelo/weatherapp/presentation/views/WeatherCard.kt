package com.sanchelo.weatherapp.presentation.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
@Preview(showBackground = true)
fun WeatherCard(
    //state: WeatherState,
    //backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(10.dp),
        modifier = modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        ) {
            Row {
                Image(
                    painter = painterResource(id = com.sanchelo.weatherapp.R.drawable.baseline_location_on_24),
                    contentDescription = null,
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                        .padding(0.dp)
                )
                Text(
                    text = "City",
                    fontSize = 15.sp
                )
            }

            Text(
                text = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd HH:mm")),
                fontSize = 15.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Light
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Row {
                        Text(
                            text = "XX°",
                            fontSize = 32.sp,
                        )
                    }
                }
                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = "WeatherType",
                        fontSize = 10.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "Max°/Min°",
                        fontSize = 10.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "Feels like DD°",
                        fontSize = 10.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Light
                    )
                }
            }
        }
    }
}
