package com.example.bai1.repository;

import com.example.bai1.entity.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> findAll();
    void add(Player player);
    void delete(int id);
}
