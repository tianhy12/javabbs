package com.example.javabbs.domain;

public class Login {
    private Integer lId;
    private User user;
    private String uUserName;
    private String lPassword;

    public Login() {
    }

    public Login(Integer lId, User user, String uUserName, String lPassword) {
        this.lId = lId;
        this.user = user;
        this.uUserName = uUserName;
        this.lPassword = lPassword;
    }

    @Override
    public String toString() {
        return "Login{" +
                "lId=" + lId +
                ", user=" + user +
                ", uUserName='" + uUserName + '\'' +
                ", lPassword='" + lPassword + '\'' +
                '}';
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public String getlPassword() {
        return lPassword;
    }

    public void setlPassword(String lPassword) {
        this.lPassword = lPassword;
    }
}
