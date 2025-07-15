package com.punt.foos.game

import org.springframework.data.jpa.repository.JpaRepository

interface GameRepository : JpaRepository<Game, Long> {

}