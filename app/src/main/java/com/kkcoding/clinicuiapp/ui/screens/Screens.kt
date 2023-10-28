package com.kkcoding.clinicuiapp.ui.screens

import com.kkcoding.clinicuiapp.R

sealed class Screens(val label: String,val route : String, val iconRes: Int) {
    object Home : Screens("Home","home_route", R.drawable.ic_home)
    object Doctors : Screens("Doctors","doctors_route",R.drawable.ic_doctor)
    object Appointment: Screens("Appointments","appointment_route",R.drawable.ic_appointment)
    object Profile : Screens("Profile","profile_route",R.drawable.ic_profile)
}