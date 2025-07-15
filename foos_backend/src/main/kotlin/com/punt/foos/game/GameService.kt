package com.punt.foos.game

import com.punt.foos.team.TeamRepository
import org.springframework.stereotype.Service

@Service
class GameService(
    private val gameRepository: GameRepository,
    private val teamRepository: TeamRepository,
) {

    fun createGame(dto: GameDto): Game {
        val teamA = teamRepository.findById(dto.teamAId)
            .orElseThrow { IllegalArgumentException("Team A not found") }
        val teamB = teamRepository.findById(dto.teamBId)
            .orElseThrow { IllegalArgumentException("Team B not found") }
        val game = Game(
            teamA = teamA,
            teamB = teamB,
            scoreA = dto.scoreA,
            scoreB = dto.scoreB,
            winner = dto.winnerId
        )
        return gameRepository.save(game)
    }

//    fun getGameById(id: Long): Game? {
//        return gameRepository.findById(id).orElse(null)
//    }

    fun getAllGames(): List<Game> {
        return gameRepository.findAll()
    }

//    fun deleteGame(id: Long) {
//        gameRepository.deleteById(id)
//    }

}