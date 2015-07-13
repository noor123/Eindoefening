package be.vdab.domain;

import javax.persistence.*;
import java.awt.*;
import java.net.URL;
import java.util.*;

@Entity
public class Movie {

    @Id @GeneratedValue private int id;
    private String title;
    private HashMap<Actor, String> cast = new HashMap<>();
    private int length;
    private String director;
    private String summary;
    @Lob private Image image;
    @OneToMany private Set<Genre> genres = new TreeSet<>();
    @Transient private float userRating;
    @Lob private URL trailer;

    public Movie(String title, HashMap<Actor, String> cast, int length, String director,
                 String summary, Image image, TreeSet<Genre> genres, float userRating, URL trailer) {
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
        this.cast.put(actor, character);
    }

    // only used for JPA
    protected Movie() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<Actor, String> getCast() {
        return cast;
    }

    public void setCast(HashMap<Actor, String> cast) {
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
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
