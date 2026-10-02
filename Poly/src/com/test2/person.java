package com.test2;

public class person {
    private String name;
    private String gender;
    private int age;

    public person() {
    }

    public person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void drive(Vehicle vehicle){
        //表示行驶
        vehicle.move();
        //表示响铃或者鸣笛
        //但是直接调用子类独有的响铃或者鸣笛会报错，因为不是父类
        //因此需要进行强制类型转换（大换小所以强制，小换大可以自动进行）
        //如下需要判断传进来的类型，以此进行相应的类型转换；
        if(vehicle instanceof bicycle){
            bicycle b=(bicycle) vehicle;
            b.ringBell();
        } else if (vehicle instanceof car) {
            car c=(car)vehicle;
            c.honk();
        } else{
            System.out.println("您输入了错误的类型");
        }
    }
}
