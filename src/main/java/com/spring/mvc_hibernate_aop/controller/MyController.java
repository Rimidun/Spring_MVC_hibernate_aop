package com.spring.mvc_hibernate_aop.controller;

import com.spring.mvc_hibernate_aop.dao.HeroesDotaDAO;
import com.spring.mvc_hibernate_aop.entity.HeroesDota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/heroesDota")
public class MyController {

    @Autowired
    private HeroesDotaDAO heroesDotaDAO;

    @RequestMapping("/")
    public String showAllHeroesDota(Model model){

        List<HeroesDota> allHeroesDota =  heroesDotaDAO.getAllHeroesDota();
        model.addAttribute("allHeroes", allHeroesDota);

        return "all-heroesdota";
    }
}
