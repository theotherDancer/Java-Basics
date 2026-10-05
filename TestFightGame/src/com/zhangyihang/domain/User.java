package com.zhangyihang.domain;

import java.util.Random;

public class User {
    //id,用户名，密码，状态
    private String id;
    private String username;
    private String password;
    private boolean status;//状态只有两种：禁用或者可用

    public User() {
        id=creatID();//因为是随机生成的不需要用户输入，所以直接放在空参构造
        //也需要修改一下status的值，因为boolean默认是false
        status=true;
    }

    public User(String id, String username, String password, boolean status) {
        id=creatID();
        this.username = username;
        this.password = password;
        status=true;
    }
    //id用户无法设置，是系统随机生成的
    public String creatID(){//注意这里是有返回值String的
        StringBuilder sb=new StringBuilder("zhang");
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
           int num=r.nextInt(10);
           sb.append(num);
        }
        return sb.toString();
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
