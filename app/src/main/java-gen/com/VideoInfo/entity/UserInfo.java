package com.VideoInfo.entity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER_INFO".
 */
public class UserInfo {

    private Long id;
    private String user_Name;
    private String user_PassWord;

    public UserInfo() {
    }

    public UserInfo(Long id) {
        this.id = id;
    }

    public UserInfo(Long id, String user_Name, String user_PassWord) {
        this.id = id;
        this.user_Name = user_Name;
        this.user_PassWord = user_PassWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_PassWord() {
        return user_PassWord;
    }

    public void setUser_PassWord(String user_PassWord) {
        this.user_PassWord = user_PassWord;
    }

}
