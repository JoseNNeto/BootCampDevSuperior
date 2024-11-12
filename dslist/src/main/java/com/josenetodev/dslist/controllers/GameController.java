package com.josenetodev.dslist.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josenetodev.dslist.dtos.GameMinDTO;
import com.josenetodev.dslist.entities.Game;
import com.josenetodev.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<Game> games = gameService.findAll();
        return games.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
