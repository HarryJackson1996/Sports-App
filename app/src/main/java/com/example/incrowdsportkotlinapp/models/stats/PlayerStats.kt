package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class PlayerStats(
    @SerializedName("formationPlace")
    val formationPlace: Int
)