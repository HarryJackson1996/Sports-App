package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class HomeTeam(
    @SerializedName("halfTimeScore")
    val halfTimeScore: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("players")
    val players: List<Player>,
    @SerializedName("score")
    val score: Int,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("teamStats")
    val teamStats: TeamStats
)