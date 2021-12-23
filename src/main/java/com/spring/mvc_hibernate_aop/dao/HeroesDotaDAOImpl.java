package com.spring.mvc_hibernate_aop.dao;

import com.spring.mvc_hibernate_aop.entity.HeroesDota;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HeroesDotaDAOImpl implements HeroesDotaDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<HeroesDota> getAllHeroesDota() {

        Session session = sessionFactory.getCurrentSession();

        List<HeroesDota> heroesDotas = session.createQuery("from HeroesDota", HeroesDota.class).getResultList();

        return heroesDotas;
    }
}
