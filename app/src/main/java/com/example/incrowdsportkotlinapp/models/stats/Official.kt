package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class Official(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("referee")
    val referee: Boolean,
    @SerializedName("type")
    val type: String
)