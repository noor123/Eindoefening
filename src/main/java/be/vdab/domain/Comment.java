package be.vdab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("comment")
public class Comment {

    @Id @GeneratedValue private Integer id;
    @ManyToOne User user;
    String description;
    @Temporal(TemporalType.TIMESTAMP) Date date;

    public Comment(User user, String description, Date date) {
        this.user = user;
        this.description = description;
        this.date = date;
    }
    // only used for JPA
    protected Comment() {}

    public Integer getId() {
        return id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
