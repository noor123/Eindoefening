package be.vdab.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserComment {
    @Id @GeneratedValue private int id;
    @ManyToOne User user;
    @Temporal(TemporalType.TIMESTAMP) Date date;
    String description;

    public UserComment(User user, Date date, String description) {
        this.user = user;
        this.date = date;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
