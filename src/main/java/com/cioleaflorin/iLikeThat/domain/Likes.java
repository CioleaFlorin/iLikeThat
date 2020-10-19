package com.cioleaflorin.iLikeThat.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Likes {
    @Id
    @GeneratedValue
    private Long id;
    private Long noOfLikes;


    @ManyToOne
    @JoinColumn(name = "photo_id", nullable = false)
    private Photo photo1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(Long noOfLikes) {
        this.noOfLikes = noOfLikes;
    }


    public Photo getPhoto() {
        return photo1;
    }

    public void setPhoto(Photo photo) {
        this.photo1 = photo;
    }
}
