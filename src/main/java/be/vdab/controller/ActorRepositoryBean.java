package be.vdab.controller;

import be.vdab.domain.Actor;

import javax.persistence.EntityManager;

public class ActorRepositoryBean {
    private EntityManager em;

    public ActorRepositoryBean(EntityManager em){
        this.em = em;
    };

    public void createActor(Actor actor) {
        em.persist(actor);
    }
}
