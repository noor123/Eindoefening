package be.vdab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id @GeneratedValue private int id;
    @ManyToOne Movie movie;
    @ManyToOne User user;
    String description;
    @Temporal(TemporalType.TIMESTAMP) Date date;

    public Comment(Movie movie, User user, String description, Date date) {
        this.movie = movie;
        this.user = user;
        this.description = description;
        this.date = date;
    }
    // only used for JPA
    protected Comment() {}

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
