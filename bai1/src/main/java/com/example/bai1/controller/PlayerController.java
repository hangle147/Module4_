package com.example.bai1.controller;

import com.example.bai1.entity.Player;
import com.example.bai1.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public String showList(Model model) {
        model.addAttribute("playerList", playerService.findAll());
        return "player/list";
    }

    @GetMapping("/players/add")
    public String showFormAdd() {
        return "player/add";
    }

    @PostMapping("/players/add")
    public String save(@RequestParam(name = "id") int id,
                       @RequestParam(name = "fullName") String fullName,
                       @RequestParam(name = "dayOfBirth") LocalDate dayOfBirth,
                       @RequestParam(name = "experience") String experience,
                       @RequestParam(name = "position") String position,
                       @RequestParam(name = "avatar") String avatar,
                       Model model) {
        playerService.add(new Player(id, fullName, dayOfBirth, experience, position, avatar));
        return "redirect:/players";
    }
}
