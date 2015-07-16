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

    @Id @GeneratedValue private Integer id;
    private String title;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    @MapKeyColumn(name = "character_name")
    private Map<String, Actor> cast = new HashMap<>();
    private int length;
    private String director;
    @OneToMany Set<Comment> comments = new TreeSet<>();
    @Lob private String summary;
    @Lob private byte[] image;
    @ManyToMany private Set<Genre> genres = new TreeSet<>();
    @Transient private int userRating;
    private URL trailer;

    public Movie(String title, Map<String, Actor> cast, int length, String director, Set<Comment> comments,
                 String summary, byte[] image, TreeSet<Genre> genres, int userRating, URL trailer) {
        this.title = title;
        this.cast = cast;
        this.length = length;
        this.director = director;
        this.comments = comments;
        this.summary = summary;
        this.image = image;
        this.genres = genres;
        this.userRating = userRating;
        this.trailer = trailer;
    }

    // only used for JPA
    protected Movie() {}

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Actor> getCast() {
        return cast;
    }

    public void addActor(String character, Actor actor) {
        this.cast.put(character, actor);
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

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public Set<Comment> getComments() {
        return comments;
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

    public int getUserRating() {
        return userRating;
    }

    public URL getTrailer() {
        return trailer;
    }

    public void setTrailer(URL trailer) {
        this.trailer = trailer;
    }

    public float calculateRating() {
        int amountOfRatings = 0;
        int sumOfRatings = 0;
        if (comments.size() == 0) {
            return 5;
        } else for (Comment comment : comments) {
            if (comment instanceof Review) {
                amountOfRatings++;
                Review r = (Review)comment;
                sumOfRatings += r.getRating();
            }
        }
       float averageRating = sumOfRatings / (float)amountOfRatings;
       userRating = (int)Math.round(averageRating*100)/10;
       return userRating;
    }

}
