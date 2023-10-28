package com.kkcoding.clinicuiapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R
import com.kkcoding.clinicuiapp.ui.components.DateBox
import com.kkcoding.clinicuiapp.ui.components.DoctorProfileWedget
import com.kkcoding.clinicuiapp.ui.components.SpecialType
import com.kkcoding.clinicuiapp.ui.theme.primaryLightBlue
import com.kkcoding.clinicuiapp.ui.theme.primaryTextColor
import com.kkcoding.clinicuiapp.ui.theme.textfieldbg
import com.kkcoding.clinicuiapp.ui.theme.wedgetOneBgColor
import com.kkcoding.clinicuiapp.ui.theme.wedgetThreeBgColor
import com.kkcoding.clinicuiapp.ui.theme.wedgetTwoBgColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DoctorsScreen() {

    var problemText by rememberSaveable {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {

        Image(
            painter = painterResource(id = R.drawable.back_error),
            contentDescription = "Back Arrow",
            modifier = Modifier.size(38.dp)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.doctor_img),
                contentDescription = "Doctor Img",
                modifier = Modifier.size(90.dp)
            )
            Text(
                text = "Dr. Sandy",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                    fontWeight = FontWeight(700),
                    color = primaryTextColor,
                )
            )
            Text(
                text = "Therapist",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                    fontWeight = FontWeight(600),
                    color = primaryTextColor,
                )
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            DoctorProfileWedget(
                boxBgColor = wedgetOneBgColor,
                iconId = R.drawable.ic_exp,
                title = "Experience",
                skill = "10 Yrs"
            )
            DoctorProfileWedget(
                boxBgColor = wedgetTwoBgColor,
                iconId = R.drawable.ic_rating,
                title = "Ratings",
                skill = "4.5"
            )
            DoctorProfileWedget(
                boxBgColor = wedgetThreeBgColor,
                iconId = R.drawable.ic_fees,
                title = "Fees",
                skill = "30000 MMK"
            )

        }

        Text(
            text = "About Doctor",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(900),
                color = primaryTextColor,
                letterSpacing = 0.3.sp,
            )
        )
        Text(
            text = stringResource(id = R.string.about_doctor),
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(400),
                color = primaryTextColor,
                letterSpacing = 0.23.sp,
            )
        )
        Text(
            text = "Date",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 27.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(600),
                color = primaryTextColor,
            )
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            DateBox(monthDay = "11", weekDay = "MON")
            DateBox(monthDay = "12", weekDay = "TUE",true)
            DateBox(monthDay = "13", weekDay = "WED")
            DateBox(monthDay = "14", weekDay = "THU")
            DateBox(monthDay = "15", weekDay = "FRI")
        }
        Text(
            text = "Time Slot",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(600),
                color = primaryTextColor,
            )
        )
        Text(
            text = "Write your problem",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(400),
                color = primaryTextColor,
                letterSpacing = 0.23.sp,
            )
        )
        TextField(
            placeholder = {
                Text(
                    text = "Write your problem",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(400),
                        color = primaryTextColor,
                        letterSpacing = 0.23.sp,
                    )
                )
            },
            value = problemText,
            onValueChange ={
                problemText = it
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(129.dp)
                .background(textfieldbg),
            colors = TextFieldDefaults.textFieldColors(
                disabledIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = primaryLightBlue
                ),
                shape = RoundedCornerShape(20.dp),
                onClick = {  }, modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Book Appointment", style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 14.sp
                    ), modifier = Modifier.padding(vertical = 10.dp)
                )
            }
        }

    }
}

