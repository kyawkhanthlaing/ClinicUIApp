package com.kkcoding.clinicuiapp.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kkcoding.clinicuiapp.R
import com.kkcoding.clinicuiapp.ui.components.DoctorSpecialtiesItem
import com.kkcoding.clinicuiapp.ui.components.SpecialType
import com.kkcoding.clinicuiapp.ui.components.TopicList
import com.kkcoding.clinicuiapp.ui.theme.ConsultBox
import com.kkcoding.clinicuiapp.ui.theme.outlineBtnColor
import com.kkcoding.clinicuiapp.ui.theme.primaryTextColor

@Composable
fun HomeScreen(
    upcomingBox: @Composable (() -> Unit)? = null
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 16.dp)
        ) {
            Text(
                text = "Welcome, Mg Mg",
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.nunitosans_regular)),
                fontWeight = FontWeight(600)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_wave),
                contentDescription = "wave logo",
                modifier = Modifier.size(32.dp)
            )

        }

        OutlinedIconButton(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(6.dp),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color.White
            ),
            border = BorderStroke(1.dp, outlineBtnColor),
            modifier = Modifier
                .fillMaxWidth()
                .height(46.dp)

        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "search icon",
                    modifier = Modifier
                        .size(16.dp)
                )
                Text(
                    text = "How are you feeling today?",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.nunitosans_regular)),
                    fontWeight = FontWeight(400),
                    color = primaryTextColor,
                )
            }


        }
        upcomingBox?.invoke()

        ConsultBox(modifier = Modifier)
        Text(
            text = "Doctor Specialties",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontWeight = FontWeight(600),
                color = primaryTextColor,
            )
        )

        LazyVerticalGrid(
            horizontalArrangement = Arrangement.SpaceAround,
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)){
            gridSpecialItem(list = specialTypeList)
        }


        TopicList(topicTitle = "Top Doctors", topicList = topicLists)
        TopicList(topicTitle = "Available Doctors")
        Spacer(modifier = Modifier.height(5.dp))

    }

}



fun LazyGridScope.gridSpecialItem(list:List<SpecialType>) {

    list.onEach {type->
        item {
            DoctorSpecialtiesItem(resid = type.iconRes, specialType = type.label)
        }
    }
}


val topicLists = listOf(
    "All", "General", "Abuse Recovery", "Eating Disorder", "Over Fat"
)

val specialTypeList = listOf<SpecialType>(
    SpecialType.Workplace,
    SpecialType.Abuse,
    SpecialType.Anxiety,
    SpecialType.Disorder,
    SpecialType.Depression,
    SpecialType.YouthSupport,
    SpecialType.SexEdu,
    SpecialType.LGBTQ,
)