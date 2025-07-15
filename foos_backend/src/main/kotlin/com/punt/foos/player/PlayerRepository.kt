package com.punt.foos.player

import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository : JpaRepository<Player, Long> {
    fun findByName(name: String): Player?
    fun existsByName(name: String): Boolean
}