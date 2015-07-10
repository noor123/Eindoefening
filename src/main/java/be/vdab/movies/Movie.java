package be.vdab.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.*;
import java.net.URL;
import java.util.HashMap;

@Entity
public class Movie {

    @Id @GeneratedValue private int id;
    private String title;
    private HashMap<Actor, String> cast;
    private int length;
    private String director;
    private String summary;
    private Image image;
    private Genre genre;
    private int userRating;
    private URL trailer;
    private float averageRating;

    public Movie(int id, String title, HashMap<Actor, String> cast, int length, String director,
                 String summary, Image image, Genre genre, int userRating, URL trailer, float averageRating) {
        this.id = id;
        this.title = title;
        this.cast = cast;
        this.length = length;
        this.director = director;
        this.summary = summary;
        this.image = image;
        this.genre = genre;
        this.userRating = userRating;
        this.trailer = trailer;
        this.averageRating = averageRating;
    }

    // only used for JPA
    protected Movie() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public URL getTrailer() {
        return trailer;
    }

    public void setTrailer(URL trailer) {
        this.trailer = trailer;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }
}
