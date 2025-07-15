package com.punt.foos.game

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/games")
class GameController(private val gameService: GameService) {

    @GetMapping
    fun getAllGames(): List<GameDto> {
        return gameService.getAllGames().map { game -> game.toDto() }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createGame(@RequestBody dto: GameDto): Game {
        return gameService.createGame(dto)
    }
}

