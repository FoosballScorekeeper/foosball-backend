package com.punt.foos.team

import com.punt.foos.player.Player
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

@Entity
data class Team(
    @Id @GeneratedValue val id: Long? = null,
    var name: String,
    @ManyToMany
    @JoinTable(
        name = "team_players",
        joinColumns = [JoinColumn(name = "team_id")],
        inverseJoinColumns = [JoinColumn(name = "player_id")]
    )
    val players: List<Player> = emptyList()
)