package com.test1;

public class Person {
    private String name;
    private String ID;
    private String pass;

    public Person() {
    }

    public Person(String name, String ID, String pass) {
        this.name = name;
        this.ID = ID;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void work(){
        System.out.println("每个人都需要工作");


    }
}
