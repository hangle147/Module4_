package com.example.player_springboot.service;

import com.example.player_springboot.entity.Player;
import com.example.player_springboot.dto.PlayerDTO;
import com.example.player_springboot.entity.Team;
import com.example.player_springboot.repository.IPlayerRepository;
import com.example.player_springboot.repository.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService{
    @Autowired
    private IPlayerRepository playerRepository;

    @Autowired
    private ITeamRepository teamRepository;


    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Player findById(int id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    public boolean add(PlayerDTO playerDTO) {
        Team team = teamRepository.findById(playerDTO.getTeamId()).orElseThrow(() -> new IllegalArgumentException("Team Not Found"));

        Player player = new Player();
        player.setFullName(playerDTO.getFullName());
        player.setDayOfBirth(playerDTO.getDayOfBirth());
        player.setExperience(playerDTO.getExperience());
        player.setPosition(playerDTO.getPosition());
        player.setAvatar(playerDTO.getAvatar());
        player.setTeam(team);

        return playerRepository.save(player) != null;
    }
}
