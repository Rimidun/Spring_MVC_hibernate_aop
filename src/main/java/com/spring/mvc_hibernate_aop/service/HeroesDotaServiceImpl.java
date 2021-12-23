package com.spring.mvc_hibernate_aop.service;

import com.spring.mvc_hibernate_aop.dao.HeroesDotaDAO;
import com.spring.mvc_hibernate_aop.entity.HeroesDota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HeroesDotaServiceImpl implements HeroesDotaService {

    @Autowired
    private HeroesDotaDAO heroesDotaDAO;

    @Override
    @Transactional
    public List<HeroesDota> getAllHeroesDota() {
        return heroesDotaDAO.getAllHeroesDota();
    }

    @Override
    @Transactional
    public void saveHeroesDota(HeroesDota heroesDota) {
        heroesDotaDAO.saveHeroesDota(heroesDota);
    }


}

