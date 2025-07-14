package com.punt.foos.game

import com.punt.foos.team.Team
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "games")
data class Game(
    @Id @GeneratedValue val id: Long? = null,
    @ManyToOne
    @JoinColumn(name = "team_a_id")
    val teamA: Team,
    @ManyToOne
    @JoinColumn(name = "team_b_id")
    val teamB: Team,
    val scoreA: Int,
    val scoreB: Int,
    val winner: Long? = null,
    val dateStarted: LocalDateTime = LocalDateTime.now(),
    val dateFinished: LocalDateTime? = null,
) {
    fun toDto(): GameDto {
        return GameDto(
            teamAId = teamA.id!!,
            teamAName = teamA.name,
            teamBId = teamB.id!!,
            teamBName = teamB.name,
            scoreA = scoreA,
            scoreB = scoreB,
            winnerId = winner,
        )
    }
}