package be.vdab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.awt.*;
import java.net.URL;
import java.util.*;

@Entity
public class Movie {

    @Id @GeneratedValue private int id;
    private String title;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    @MapKeyColumn(name = "character_name")
    private Map<String, Actor> cast = new HashMap<>();

    private int length;
    private String director;
    @Lob private String summary;
    @Lob private byte[] image;
    @ManyToMany private Set<Genre> genres = new TreeSet<>();
    @Transient private float userRating;
    @Lob private URL trailer;

    public Movie(String title, Map<String, Actor> cast, int length, String director,
                 String summary, byte[] image, TreeSet<Genre> genres, float userRating, URL trailer) {
        this.title = title;
        this.cast = cast;
        this.length = length;
        this.director = director;
        this.summary = summary;
        this.image = image;
        this.genres = genres;
        this.userRating = userRating;
        this.trailer = trailer;
    }

    public void addActor(Actor actor, String character) {
        this.cast.put(character, actor);
    }

    // only used for JPA
    protected Movie() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Actor> getCast() {
        return cast;
    }

    public void setCast(HashMap<String, Actor> cast) {
        this.cast = cast;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }

    public void removeGenre(Genre genre) {
        this.genres.remove(genre);
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }

    public URL getTrailer() {
        return trailer;
    }

    public void setTrailer(URL trailer) {
        this.trailer = trailer;
    }

}
