package com.punt.foos.player

import org.springframework.stereotype.Service

@Service
class PlayerService(private val playerRepository: PlayerRepository) {
//    fun getPlayerByName(name: String): Player? {
//        return playerRepository.findByName(name)
//    }
//
//    fun createPlayer(name: String): Player {
//        if (playerRepository.existsByName(name)) {
//            throw IllegalArgumentException("Player with name $name already exists")
//        }
//        val player = Player(name = name)
//        return playerRepository.save(player)
//    }

    fun getAllPlayers(): List<Player> {
        return playerRepository.findAll()
    }
}