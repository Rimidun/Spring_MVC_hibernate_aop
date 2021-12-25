package com.spring.mvc_hibernate_aop.controller;

import com.spring.mvc_hibernate_aop.entity.HeroesDota;
import com.spring.mvc_hibernate_aop.service.HeroesDotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    private HeroesDotaService heroesDotaService;

    @GetMapping("/")
    public String showAllHeroesDota(Model model) {

        List<HeroesDota> allHeroesDota = heroesDotaService.getAllHeroesDota();
        model.addAttribute("allHeroes", allHeroesDota);

        return "all-heroesdota";
    }

    @GetMapping("/addHeroesDota")
    public String addHeroesDota(Model model) {

        HeroesDota heroesDota = new HeroesDota();
        model.addAttribute("heroes", heroesDota);
        return "add-heroesdota";
    }

    @PostMapping("/saveHeroesDota")
    public String saveHeroesDota(@ModelAttribute("heroes") HeroesDota heroesDota) {

        heroesDotaService.saveHeroesDota(heroesDota);
        return "redirect:/";
    }

    @GetMapping("/updateHeroesDota")
    public String updateHeroesDota(@RequestParam("heroesId") int id, Model model) {

        HeroesDota heroesDota = heroesDotaService.getHeroesDota(id);
        model.addAttribute("heroes", heroesDota);

        return "add-heroesdota";
    }

    @GetMapping("/deleteHeroesDota")
    public String deleteHeroesDota(@RequestParam("heroesId") int id, Model model) {

        heroesDotaService.deleteHeroesDota(id);

        return "redirect:/";
    }
}
