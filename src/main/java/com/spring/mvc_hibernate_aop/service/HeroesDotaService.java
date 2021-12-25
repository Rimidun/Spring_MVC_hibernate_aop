package com.spring.mvc_hibernate_aop.service;

import com.spring.mvc_hibernate_aop.entity.HeroesDota;

import java.util.List;

public interface HeroesDotaService {

    public List<HeroesDota> getAllHeroesDota();

    public void saveHeroesDota(HeroesDota heroesDota);

    public HeroesDota getHeroesDota(int id);

    public void deleteHeroesDota(int id);
}
