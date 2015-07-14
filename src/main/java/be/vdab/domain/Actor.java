package be.vdab.domain;

import org.springframework.stereotype.*;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
public class Actor {

    @Id @GeneratedValue private Integer id;
    private String firstName;
    private String lastName;
    @Lob private String biography;
    @Temporal(TemporalType.TIMESTAMP) private Date birthdate;
    @Enumerated(EnumType.STRING) private Gender gender;
    @Lob private byte[] profileImage;

    public Actor(String firstName, String lastName, String biography, Date birthdate, Gender gender, byte[] profileImage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.biography = biography;
        this.birthdate = birthdate;
        this.gender = gender;
        this.profileImage = profileImage;
    }

    // only used for JPA
    protected Actor() {}

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
