package com.jaydenxiao.mvpframework.bean;

import java.io.Serializable;

/**
 * des:用户
 * Created by xsf
 * on 2016.09.15:11
 */

public class User implements Serializable {
    private String token;
    private String username;
    private String telephone;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
