package com.kkcoding.clinicuiapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R
import com.kkcoding.clinicuiapp.ui.theme.primaryBgColor
import com.kkcoding.clinicuiapp.ui.theme.primaryLightBlue
import com.kkcoding.clinicuiapp.ui.theme.primaryTextColor
import com.kkcoding.clinicuiapp.ui.theme.secondaryBgColor
import com.kkcoding.clinicuiapp.ui.theme.white

@Composable
fun DoctorItem() {

    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = white
        ),
        modifier = Modifier
            .width(180.dp)
    ) {

        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(white)
        ) {

            Image(
                painter = painterResource(id = R.drawable.doctor_profile),
                contentDescription = "doctor profile",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .clip(RoundedCornerShape(5.dp))
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Dr. Myo",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily =  MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(600),
                        color = primaryTextColor
                    )
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_rating),
                        contentDescription = "Rating Image",
                        modifier = Modifier
                            .size(12.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "4.5 (320)",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily =  MaterialTheme.typography.bodyLarge.fontFamily,
                            fontWeight = FontWeight(600),
                            color = primaryTextColor,
                        )
                    )
                }

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_specialization),
                    contentDescription = "Rating Image",
                    modifier = Modifier
                        .size(12.dp)
                        .background(color = primaryBgColor)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "SRE Lead at Onenex",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(400),
                        color = primaryTextColor,
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
                    .clip(RoundedCornerShape(5.dp))
                    .background(secondaryBgColor)
                    .padding(3.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                ) {
                    Text(
                        text = "Experience",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                            fontWeight = FontWeight(400),
                            color = primaryTextColor,
                        )
                    )
                    Text(
                        text = "12 years",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily =  MaterialTheme.typography.bodyLarge.fontFamily,
                            fontWeight = FontWeight(700),
                            color = primaryTextColor,
                        )
                    )
                }
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                ) {
                    Text(
                        text = "Fees",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(400),
                            fontFamily =  MaterialTheme.typography.bodyLarge.fontFamily,
                            color = primaryTextColor,
                        )
                    )
                    Text(
                        text = "30000 MMK",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(700),
                            fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                            color = primaryTextColor,
                        )
                    )
                }
            }

            Button(
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = primaryLightBlue,
                    contentColor = white
                ),
                onClick = { /*TODO*/ },
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
            ) {
                Text(

                    text = "Make Appointment",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(600),
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily
                        ),
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }


        }

    }
}

@Preview
@Composable
fun DoctorItemPreview() {
    DoctorItem()
}