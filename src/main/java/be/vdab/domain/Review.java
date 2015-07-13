package be.vdab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.OneToMany;
import java.util.Date;
import java.util.TreeSet;

public class Review extends Comment {
    private int rating;
    @OneToMany private TreeSet<UserComment> userComments = new TreeSet<>();

    public Review(Movie movie, User user, String description, Date date, int rating) {
        super(movie, user, description, date);
        this.rating = rating;
    }

    // only used for JPA
    protected Review() {}

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void addUserComment(UserComment uc) {
        this.userComments.add(uc);
    }

    public TreeSet<UserComment> getUserComments() {
        return userComments;
    }
}
