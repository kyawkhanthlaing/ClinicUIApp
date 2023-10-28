package com.kkcoding.clinicuiapp.ui.components

import com.kkcoding.clinicuiapp.ui.screens.Screens

data class BottomNavigationItem(
    val label : String = "",
    val icon : Int=0,
    val route : String = ""
) {

    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = Screens.Home.label,
                icon = Screens.Home.iconRes,
                route = Screens.Home.route
            ),
            BottomNavigationItem(
                label = Screens.Doctors.label,
                icon = Screens.Doctors.iconRes,
                route = Screens.Doctors.route
            ),
            BottomNavigationItem(
                label = Screens.Appointment.label,
                icon = Screens.Appointment.iconRes,
                route = Screens.Appointment.route
            ),
            BottomNavigationItem(
                label= Screens.Profile.label,
                icon = Screens.Profile.iconRes,
                route = Screens.Profile.route
            )
        )
    }
}