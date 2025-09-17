package com.example.bai1.service;

import com.example.bai1.entity.Player;
import com.example.bai1.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService{
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public void add(Player player) {
        playerRepository.add(player);
    }

    @Override
    public void delete(int id) {
        playerRepository.delete(id);
    }
}
