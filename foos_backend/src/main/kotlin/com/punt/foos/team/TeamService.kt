package com.punt.foos.team

import org.springframework.stereotype.Service

@Service
class TeamService(val teamRepository: TeamRepository) {

//    fun createTeam(teamDto: TeamDto): Team {
//        val team = Team(
//            name = teamDto.name,
//            players = teamDto.players.map { Player(name = it) }
//        )
//        return teamRepository.save(team)
//    }
//
//    fun getTeamById(id: Long): Team? {
//        return teamRepository.findById(id).orElse(null)
//    }

    fun getAllTeams(): List<Team> {
        return teamRepository.findAll()
    }

//    fun updateTeam(id: Long, teamDto: TeamDto): Team? {
//        val existingTeam = getTeamById(id) ?: return null
//        existingTeam.name = teamDto.name
//        return teamRepository.save(existingTeam)
//    }
//
//    fun deleteTeam(id: Long) {
//        teamRepository.deleteById(id)
//    }
}