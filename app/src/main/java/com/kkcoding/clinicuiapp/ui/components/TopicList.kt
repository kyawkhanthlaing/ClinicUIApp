package com.kkcoding.clinicuiapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R
import com.kkcoding.clinicuiapp.ui.screens.topicLists
import com.kkcoding.clinicuiapp.ui.theme.primaryLightBlue
import com.kkcoding.clinicuiapp.ui.theme.primaryTextColor
import com.kkcoding.clinicuiapp.ui.theme.primaryOneBgColor

@Composable
fun TopicList(topicTitle: String,topicList: List<String> = emptyList()){


    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = topicTitle,
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                fontFamily = FontFamily(Font(R.font.nunitosans_regular)),
                color = primaryTextColor,
            )
        )
        Text(
            text = "View All",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.nunitosans_regular)),
                fontWeight = FontWeight(700),
                color = primaryLightBlue,
            )
        )
    }
    if(topicList.isNotEmpty()){
        LazyRow(
            userScrollEnabled = true,
            contentPadding = PaddingValues(0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            items(topicList.size){index->
                OutlinedButton(
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = primaryOneBgColor
                    ),
                    shape = RoundedCornerShape(7.dp),
                    border = BorderStroke(1.dp, primaryLightBlue),
                    onClick = {},
                ) {
                    Text(
                        text = topicLists[index],
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.nunitosans_regular)),
                            fontWeight = FontWeight(400),
                            color = primaryTextColor,
                        ),
                    )
                }
            }
        }
    }


    LazyRow(
        userScrollEnabled = true,
        contentPadding = PaddingValues(0.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ){
        items (4){index->
            DoctorItem()
        }
    }
}