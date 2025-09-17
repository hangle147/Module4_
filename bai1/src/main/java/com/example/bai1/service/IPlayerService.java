package com.example.bai1.service;

import com.example.bai1.entity.Player;

import java.util.List;

public interface IPlayerService {
    List<Player> findAll();
    void add(Player player);
    void delete(int id);
}
