package com.cioleaflorin.iLikeThat.transfer;

import com.sun.istack.NotNull;

public class SaveAccountRequest {
    @NotNull
    private String nickname;
    private String description;


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
}
