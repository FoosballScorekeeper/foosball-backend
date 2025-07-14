package com.punt.foos.team

data class TeamDto(
    val id: Long? = null,
    val name: String,
    val players: List<String> = emptyList()
)
