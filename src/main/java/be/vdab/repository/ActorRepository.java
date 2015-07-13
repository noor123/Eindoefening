package be.vdab.repository;

import be.vdab.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {


    // em.find(Actor.class, id);
    // em.remove(b);
    // em.createQuery("select b from x").getResultList();
}
