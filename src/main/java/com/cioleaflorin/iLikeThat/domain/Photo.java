package com.cioleaflorin.iLikeThat.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Photo {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String url;
    private String location;

    @OneToMany(mappedBy = "photo")
    private Set<Comment> comments=new HashSet<>();

    @OneToMany(mappedBy = "photo1")
    private Set<Likes> likes=new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Likes> getLikes() {
        return likes;
    }

    public void setLikes(Set<Likes> likes) {
        this.likes = likes;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
