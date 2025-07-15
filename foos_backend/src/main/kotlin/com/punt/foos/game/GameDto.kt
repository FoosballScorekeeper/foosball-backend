package com.punt.foos.game

data class GameDto(
    val teamAId: Long,
    val teamAName: String,
    val teamBId: Long,
    val teamBName: String,
    val scoreA: Int,
    val scoreB: Int,
    val winnerId: Long?
)