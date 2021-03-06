package be.vdab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class User {

    @Id @GeneratedValue private Integer id;
    String username;
    String password;
    @ManyToMany Set<Movie> savedMovies = new TreeSet<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // only used for JPA
    protected User() {}

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addMovie(Movie movie) {
        this.savedMovies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this.savedMovies.remove(movie);
    }

    public Set<Movie> getSavedMovies() {
        return savedMovies;
    }
}
