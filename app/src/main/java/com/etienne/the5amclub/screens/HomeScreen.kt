package com.etienne.the5amclub.screens


//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
//import androidx.compose.foundation.layout.RowScopeInstance.align


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.etienne.the5amclub.R
import java.time.LocalDateTime

data class Event(
    val name: String,
    val color: Color,
    val start: LocalDateTime,
    val end: LocalDateTime,
    val description: String? = null,
)
@Composable
fun HomeScreen(
    ) {
    val brush2 = Brush.linearGradient(listOf(Color.DarkGray, Color.Black))


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush2),
    ) {
        LazyColumn {

            item {
                Box(
                    //horizontalAlignment = Alignment.CenterHorizontally,
                    //verticalArrangement = Arrangement.Top,
                    modifier = Modifier.fillMaxWidth()
                )
                {

                    Text(
                        text = "Quote",
                        fontSize = MaterialTheme.typography.h3.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.TopStart)
                    )



                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "null",
                        alignment = Alignment.TopEnd,

                        // crop the image if it's not a square
                        modifier = Modifier

                            .size(90.dp) // clip to the circle shape
                            .border(10.dp, Color.Gray)
                            .offset(x = 0.dp, y = 0.dp)// add a border (optional)
                            .padding(bottom = 0.dp)
                            .align(Alignment.TopEnd)
                    )
                }


            }
            item {
                Column(
                    modifier = Modifier
                        .fillParentMaxSize()
                        .background(Color.White)
                ) {
                    Schedule(events = sampleEvents)
                }
            }
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                )
                {

                    Text(
                        text = "Quote",
                        fontSize = MaterialTheme.typography.h3.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,

                        )

                    Row()
                    {


                    }
                    Row()
                    {

                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "null",


                    // crop the image if it's not a square
                    modifier = Modifier

                        .size(90.dp) // clip to the circle shape
                        .border(10.dp, Color.Gray)
                        .offset(x = 0.dp, y = 0.dp)// add a border (optional)
                        .padding(bottom = 0.dp)
                        .align(Alignment.TopEnd)
                )
            }


        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {


    HomeScreen()
}