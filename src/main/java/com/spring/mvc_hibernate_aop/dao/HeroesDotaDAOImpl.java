package com.spring.mvc_hibernate_aop.dao;

import com.spring.mvc_hibernate_aop.entity.HeroesDota;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HeroesDotaDAOImpl implements HeroesDotaDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<HeroesDota> getAllHeroesDota() {
        Session session = sessionFactory.getCurrentSession();
        List<HeroesDota> heroesDota = session.createQuery("from HeroesDota", HeroesDota.class).getResultList();
        return heroesDota;
    }

    @Override
    public void saveHeroesDota(HeroesDota heroesDota) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(heroesDota);
    }

    @Override
    public HeroesDota getHeroesDota(int id) {
        Session session = sessionFactory.getCurrentSession();
        HeroesDota heroesDota = session.get(HeroesDota.class, id);
        return heroesDota;
    }

    @Override
    public void deleteHeroesDota(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<HeroesDota> query = session.createQuery("delete from HeroesDota " + "where id =:heroesId");
        query.setParameter("heroesId", id);
        query.executeUpdate();
    }

}
