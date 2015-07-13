package be.vdab.domain;

import org.springframework.stereotype.*;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
public class Actor {

    @Id @GeneratedValue private int id;
    private String biography;
    @Temporal(TemporalType.TIMESTAMP) private Date birthdate;
    @Enumerated private Gender gender;
    @Lob private byte[] profileImage;

    public Actor(String biography, Date birthdate, Gender gender, byte[] profileImage) {
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

    public byte[] getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage;
    }

}
