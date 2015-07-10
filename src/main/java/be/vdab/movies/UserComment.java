package be.vdab.movies;

import java.util.Date;

public class UserComment {
    User user;
    Date date;
    String comment;

    public UserComment(User user, Date date, String comment) {
        this.user = user;
        this.date = date;
        this.comment = comment;
    }

    // only used for JPA
    protected UserComment() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
