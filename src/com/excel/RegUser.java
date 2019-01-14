package com.excel;

/**
 * Created by ：Corey
 * 17:36 2018/11/9
 */
public class RegUser {

    private  String id;

    private  String UserName;

    private  String password;

    private String UserContent;

    private  String flag;

    private  String userTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserContent() {
        return UserContent;
    }

    public void setUserContent(String userContent) {
        UserContent = userContent;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }
}
