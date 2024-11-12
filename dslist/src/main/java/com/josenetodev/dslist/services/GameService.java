package com.josenetodev.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.josenetodev.dslist.dtos.GameMinDTO;
import com.josenetodev.dslist.entities.Game;
import com.josenetodev.dslist.repositories.GameRepository;

@Service
public class GameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll() {
        List<Game> games = gameRepository.findAll();
        // return games.stream().map(GameMinDTO::new).collect(Collectors.toList());
        return games;
    }
}
