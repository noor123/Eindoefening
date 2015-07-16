package be.vdab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

@Entity
@DiscriminatorValue("review")
public class Review extends Comment {
    private int rating;
    @OneToMany private Set<UserComment> userComments = new TreeSet<>();

    public Review(User user, String description, Date date, int rating) {
        super(user, description, date);
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

    public Set<UserComment> getUserComments() {
        return userComments;
    }
}
