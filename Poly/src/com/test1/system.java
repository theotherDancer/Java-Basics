package com.test1;

public class system {
    //定义一个方法表示注册用户
    public void rigister(Person per){
        System.out.println("姓名为"+per.getName()+"的账户注册成功，账号为"+per.getID()+"密码为"+per.getPass());
        per.work();
    }

}
