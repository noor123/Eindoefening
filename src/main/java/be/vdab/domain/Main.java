package be.vdab.domain;

import be.vdab.controller.ActorRepositoryBean;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.sql.Date;
import java.time.Instant;
import java.util.List;

import static javax.imageio.ImageIO.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Set up
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RealDolmenPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Ready to do stuff!
        ActorRepositoryBean arb = new ActorRepositoryBean(em);
        BufferedImage img = read(new File("src/main/java/resources/META-INF/image.jpg")); // TODO: maybe find a better way to do this
        Actor actor = new Actor("This is a dummy biography", Date.from(Instant.parse("2015-05-27")),Gender.MAN, img);
        arb.createActor(actor);

        // Tear down
        em.getTransaction().commit();
        em.close();
        emf.close();
    }


}
