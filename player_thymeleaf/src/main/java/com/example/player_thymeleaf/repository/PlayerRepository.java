package com.example.player_thymeleaf.repository;

import com.example.player_thymeleaf.entity.Player;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository implements IPlayerRepository {
    private static List<Player> playerList = new ArrayList<>();
    static {
        playerList.add(new Player(
                1,
                "Nguyễn Văn A",
                LocalDate.of(1995, 5, 20),   // 20/05/1995
                "5 năm kinh nghiệm",
                "Tiền đạo",
                "https://i.pinimg.com/736x/c6/e5/65/c6e56503cfdd87da299f72dc416023d4.jpg"
        ));
    }

    @Override
    public List<Player> findAll() {
        return playerList;
    }

    @Override
    public void add(Player player) {
        playerList.add(player);
    }

    @Override
    public void delete(int id) {
        playerList.removeIf(player -> player.getId() == id);
    }
}
