package com.example.bai1.controller;

import com.example.bai1.entity.Player;
import com.example.bai1.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("/player/list");
        modelAndView.addObject("playerList", playerService.findAll());
        return modelAndView;
    }

    @GetMapping("/add")
    public String showFormAdd(Model model) {
        model.addAttribute("player", new Player());
        return "player/add";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute(name = "player") Player player,
                       RedirectAttributes redirectAttributes) {
        playerService.add(player);
        redirectAttributes.addFlashAttribute("message", "Add success");
        return "redirect:/players";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        playerService.delete(id);
        return "redirect:/players";
    }
}
