package be.vdab.movies;

import javax.persistence.Entity;
import java.awt.*;
import java.util.Date;

@Entity
public class Actor {
    private String biography;
    private Date birthdate;
    private Gender gender;
    private Image profileImage;

    public Actor(String biography, Date birthdate, Gender gender, Image profileImage) {
        this.biography = biography;
        this.birthdate = birthdate;
        this.gender = gender;
        this.profileImage = profileImage;
    }

    // only used for JPA
    protected Actor() {}

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

}
