package com.kkcoding.clinicuiapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R
import com.kkcoding.clinicuiapp.ui.theme.outlineBtnColor
import com.kkcoding.clinicuiapp.ui.theme.primaryLightBlue
import com.kkcoding.clinicuiapp.ui.theme.primaryTextColor
import com.kkcoding.clinicuiapp.ui.theme.secondaryOneBgColor
import com.kkcoding.clinicuiapp.ui.theme.white
import com.kkcoding.clinicuiapp.ui.theme.yellow

@Composable
fun UpcomingAppointBox() {

    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp)
    ) {

        Column(
            verticalArrangement = Arrangement.spacedBy(23.dp),
            modifier = Modifier
                .fillMaxSize()
                .background(white)
                .padding(16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.doctor_pic),
                    contentDescription = "Doctor Profile",
                    modifier = Modifier.size(88.dp)
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Dr. Sandy",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                            fontWeight = FontWeight(600),
                            color = primaryTextColor,
                        )
                    )
                    CustomDateTimeText(iconId = R.drawable.ic_calendar, time = "December 14,  2023")
                    CustomDateTimeText(iconId = R.drawable.ic_clock, time = "08:00 - 09:00 AM")

                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .width(63.dp)
                        .height(22.dp)
                        .background(secondaryOneBgColor)
                        .border(
                            width = 0.2.dp,
                            color = yellow,
                            shape = RoundedCornerShape(size = 5.dp)
                        )
                ) {
                    Text(
                        text = "Upcoming",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                            fontWeight = FontWeight(600),
                            color = yellow,
                        )
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = outlineBtnColor
                    ),
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(147.dp)
                        .height(43.dp)

                ) {
                    Text(
                        text = "Cancel",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                            fontWeight = FontWeight(400),
                            color = primaryTextColor,
                        )
                    )

                }

                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = primaryLightBlue,
                        contentColor = white
                    ),
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(147.dp)
                        .height(43.dp)

                ) {

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ic_call),
                            contentDescription = "call icon",
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "Call",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                                fontWeight = FontWeight(400),
                            )
                        )
                    }


                }
            }
        }

    }
}

@Composable
fun CustomDateTimeText(iconId: Int, time: String) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = time,
            modifier = Modifier.size(16.dp)
        )
        Text(
            text = time,
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(400),
                color = primaryTextColor,
            )
        )
    }
}