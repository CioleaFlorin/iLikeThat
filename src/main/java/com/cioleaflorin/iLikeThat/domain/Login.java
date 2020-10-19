package com.cioleaflorin.iLikeThat.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Login {
    @Id
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;

    @OneToOne
    @MapsId
    private Account accountx;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return accountx;
    }

    public void setAccount(Account account) {
        this.accountx = account;
    }
}
