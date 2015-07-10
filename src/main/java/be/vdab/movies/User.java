package be.vdab.movies;

import java.util.TreeSet;

public class User {
    String username;
    String password;
    TreeSet<Movie> savedMovies;

    public User(String username, String password, TreeSet<Movie> savedMovies) {
        this.username = username;
        this.password = password;
        this.savedMovies = savedMovies;
    }

    // only used for JPA
    protected User() {}

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

    public TreeSet<Movie> getSavedMovies() {
        return savedMovies;
    }

    public void setSavedMovies(TreeSet<Movie> savedMovies) {
        this.savedMovies = savedMovies;
    }

}
