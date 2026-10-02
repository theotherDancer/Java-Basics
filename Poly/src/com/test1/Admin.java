package com.test1;

public class Admin extends Person{
    public Admin() {
    }

    public Admin(String name, String ID, String pass) {
        super(name, ID, pass);
    }

    @Override
    public void work() {
        System.out.println("管理员需要管理");
    }
}
