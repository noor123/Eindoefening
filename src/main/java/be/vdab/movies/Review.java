package be.vdab.movies;

import java.util.TreeSet;

public class Review extends Comment {
    private int rating;
    private TreeSet<UserComment> userComments;

    public Review(Movie movie, User user, String description, int rating, TreeSet<UserComment> userComments) {
        super(movie, user, description);
        this.rating = rating;
        this.userComments = userComments;
    }

    // only used for JPA
    protected Review() {}

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public TreeSet<UserComment> getUserComments() {
        return userComments;
    }

    public void setUserComments(TreeSet<UserComment> userComments) {
        this.userComments = userComments;
    }
}
