package com.kkcoding.clinicuiapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R

@Composable
fun ConsultBox(modifier: Modifier) {


    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = ShapeDefaults.Medium,
        modifier = modifier
            .fillMaxWidth()

    ) {

        Row (
            modifier=modifier.fillMaxSize()
                .padding(10.dp)
        ){
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
                    .fillMaxWidth(0.65f)
                    .fillMaxHeight()
            ) {
                Text(
                    text = "Consult With Top Specialists",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(700),
                        color = primaryTextColor,
                    )
                )

                Text(
                    text = "Consult with top doctors \nover Video calls and Recover\n your mental Health",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(400),
                        color = primaryTextColor,
                    )
                )

               Button(
                   shape = RoundedCornerShape(10.dp),
                   colors = ButtonDefaults.buttonColors(
                       containerColor = primaryLightBlue,
                   ),
                   modifier = modifier
                       .width(87.dp)
                       .height(34.dp),
                   contentPadding = PaddingValues(0.dp),
                   onClick = { }) {

                   Text(
                       text = "Consult Now",
                       style = TextStyle(
                           fontSize = 12.sp,
                           lineHeight = 18.sp,
                           fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                           fontWeight = FontWeight(600),
                           color = white,
                           textAlign = TextAlign.Center,
                       )
                   )
                   
               }
            }

            Image(
                painter = painterResource(id = R.drawable.ic_consult),
                contentDescription ="cousult photo",
                contentScale = ContentScale.FillBounds,
                modifier = modifier
                    .width(154.dp)
                    .height(99.dp)
                    .align(Alignment.CenterVertically)
                    .padding(5.dp)
            )

        }


    }
}

@Preview
@Composable
fun ConsultBoxPreview() {
    ConsultBox(modifier = Modifier)
}