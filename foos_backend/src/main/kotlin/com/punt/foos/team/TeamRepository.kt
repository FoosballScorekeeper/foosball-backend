package com.punt.foos.team

import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, Long> {
}