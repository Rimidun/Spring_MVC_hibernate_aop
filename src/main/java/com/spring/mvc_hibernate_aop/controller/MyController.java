package com.spring.mvc_hibernate_aop.controller;

import com.spring.mvc_hibernate_aop.entity.HeroesDota;
import com.spring.mvc_hibernate_aop.service.HeroesDotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/heroesDota")
public class MyController {

    @Autowired
    private HeroesDotaService heroesDotaService;

    @RequestMapping("/")
    public String showAllHeroesDota(Model model) {

        List<HeroesDota> allHeroesDota = heroesDotaService.getAllHeroesDota();
        model.addAttribute("allHeroes", allHeroesDota);

        return "all-heroesdota";
    }

    @RequestMapping("/addHeroesDota")
    public String addHeroesDota(Model model){

        HeroesDota heroesDota = new HeroesDota();
        model.addAttribute("heroes", heroesDota);
        return "add-heroesdota";
    }

    @RequestMapping("/saveHeroesDota")
    public String saveHeroesDota(@ModelAttribute("heroes") HeroesDota heroesDota){

        heroesDotaService.saveHeroesDota(heroesDota );
        return "redirect:/heroesDota/";
    }
}
