package com.cioleaflorin.iLikeThat.domain;

import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String nickname;
    private String description;
    @OneToMany(mappedBy = "account")
    private Set<Photo> photos;


    //using OneToOne with Shared Primary Key
    @OneToOne(mappedBy = "accountx", cascade = CascadeType.ALL)
    Login login;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
