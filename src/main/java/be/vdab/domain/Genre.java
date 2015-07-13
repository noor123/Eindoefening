package be.vdab.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Genre {
    @Id private String name;

    public Genre(String name) {
        this.name = name;
    }

    // only used for JPA
    protected Genre() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
