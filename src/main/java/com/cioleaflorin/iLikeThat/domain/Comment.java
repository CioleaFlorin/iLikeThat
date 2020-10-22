package com.cioleaflorin.iLikeThat.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String comment;
    private Long noOfLikes;
    //private Set<Account> accounts=new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "photo_id", nullable = false)
    private Photo photo;
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(Long noOfLikes) {
        this.noOfLikes = noOfLikes;
    }



    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }


}
