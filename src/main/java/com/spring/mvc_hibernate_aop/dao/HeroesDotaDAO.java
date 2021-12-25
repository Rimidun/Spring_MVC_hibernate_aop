package com.spring.mvc_hibernate_aop.dao;

import com.spring.mvc_hibernate_aop.entity.HeroesDota;

import java.util.List;

public interface HeroesDotaDAO {

    public List<HeroesDota> getAllHeroesDota();

    public void saveHeroesDota(HeroesDota heroesDota);

    public HeroesDota getHeroesDota(int id);
}

