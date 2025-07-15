package com.punt.foos.player

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/players")
class PlayerController(
    private val playerService: PlayerService
) {
     @GetMapping
     fun getAllPlayers(): List<PlayerDto> {
         return playerService.getAllPlayers().map { player -> player.toDto() }
     }
}