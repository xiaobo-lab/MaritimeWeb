package com.xiao.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String account;
    private String password;
    private String name;
    //identity表示身份 1为老师 0为学生
    private byte identity;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", identity=" + identity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getIdentity() {
        return identity;
    }

    public void setIdentity(byte identity) {
        this.identity = identity;
    }
}
