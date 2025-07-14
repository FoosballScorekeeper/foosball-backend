package com.punt.foos.player

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Player(
    @Id @GeneratedValue val id: Long? = null,
    val name: String,
) {
    fun toDto(): PlayerDto {
        return PlayerDto(name)
    }
}
