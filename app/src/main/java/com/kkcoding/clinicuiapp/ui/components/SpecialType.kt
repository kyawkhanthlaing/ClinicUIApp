package com.kkcoding.clinicuiapp.ui.components

import com.kkcoding.clinicuiapp.R

sealed class SpecialType(val label: String, val iconRes: Int) {
    object Workplace : SpecialType("Workplace", R.drawable.ic_workplace)
    object Abuse : SpecialType("Abuse", R.drawable.ic_abuse)
    object Anxiety : SpecialType("Anxiety", R.drawable.ic_anxiety)
    object Disorder : SpecialType("Disorder", R.drawable.ic_disorder)
    object Depression : SpecialType("Depression", R.drawable.ic_depression)
    object YouthSupport : SpecialType("Youth Support", R.drawable.ic_youth_support)
    object SexEdu : SpecialType("Sex Edu", R.drawable.ic_sexedu)
    object LGBTQ : SpecialType("LGBTQ+", R.drawable.ic_lgbtq)
}

