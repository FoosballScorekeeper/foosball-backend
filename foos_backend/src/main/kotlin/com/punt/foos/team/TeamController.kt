package com.punt.foos.team

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/teams")
class TeamController(private val teamService: TeamService) {
    // Placeholder for future methods
    // This controller will handle team-related endpoints
    // For example, you might add methods to create, update, delete, and retrieve teams

     @GetMapping
     fun getAllTeams(): List<Team> {
         return teamService.getAllTeams()
     }
}