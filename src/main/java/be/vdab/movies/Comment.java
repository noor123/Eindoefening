package be.vdab.movies;

public class Comment {
    Movie movie;
    User user;
    String description;

    public Comment(Movie movie, User user, String description) {
        this.movie = movie;
        this.user = user;
        this.description = description;
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
}
