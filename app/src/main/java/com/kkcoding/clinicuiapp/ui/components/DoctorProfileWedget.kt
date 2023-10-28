package com.kkcoding.clinicuiapp.ui.components

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R
import com.kkcoding.clinicuiapp.ui.theme.primaryTextColor
import com.kkcoding.clinicuiapp.ui.theme.secondaryTextColor
import com.kkcoding.clinicuiapp.ui.theme.wedgetOneBgColor
import com.kkcoding.clinicuiapp.ui.theme.white

@Composable
fun DoctorProfileWedget(
    boxBgColor: Color,
    iconId: Int,
    title: String,
    skill: String
) {

    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = white
        ),
        modifier = Modifier
            .width(110.dp)
            .height(130.dp)
    ) {

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .width(49.dp)
                    .height(63.dp)
                    .background(boxBgColor, RoundedCornerShape(0.dp, 0.dp, 15.dp, 15.dp))
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = iconId),
                    contentDescription = "experience wedget",
                    modifier = Modifier.size(22.dp)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(3.dp),
                modifier = Modifier.padding(0.dp,5.dp)
            ) {
                Text(
                    text = skill,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(700),
                        color = primaryTextColor,
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.49.sp,
                    )
                )
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                        fontWeight = FontWeight(600),
                        color = secondaryTextColor,
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.37.sp,
                    )
                )
            }

        }
    }

}

