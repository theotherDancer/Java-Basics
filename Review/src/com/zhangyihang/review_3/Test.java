package com.zhangyihang.review_3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("xiaolin", "abc123"));
        users.add(new User("xiaozhou", "xyz456"));
        User result1 = findUser(users, "nobody");
        User result2 = findUser(users, new String("xiaolin"));
        if(result1==null) {
            System.out.println("用户不存在");
        }
            else{
            System.out.println(result1.getUsername());
        }
        if(result2==null) {
            System.out.println("用户不存在");
        }
        else{
            System.out.println(result2.getUsername());
        }
        login(users, "xiaolin", "abc123"); // 登录成功
        login(users, "xiaolin", "wrong");  // 密码错误
        login(users, "nobody", "abc123");  // 用户不存在
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(users.size()); // 2

        register(users, "xiaowang", "abc789");
        System.out.println(users.size()); // 3

        register(users, "xiaowang", "other123");
        System.out.println(users.size()); // 仍然是 3

        login(users, "xiaowang", "abc789"); // 登录成功

        boolean success = register(users, "xiaoli", "abc123");

        if (success) {
            System.out.println("可以进入下一步");
            login(users,"xiaoli","abc123");
        }else{
            System.out.println("本次不执行登录");
        }
        boolean successs = register(users, "xiaoli", "abc123");

        if (successs) {
            System.out.println("可以进入下一步");
            login(users,"xiaoli","abc123");
        }else{
            System.out.println("本次不执行登录");
        }

    }
    public static User findUser(ArrayList<User> users, String username) {
        // 根据用户名查找用户
        for (int i = 0; i < users.size(); i++) {
          if (users.get(i).getUsername().equals(username)){

              return users.get(i);
            }
        }return null;
    }
    public static void login(
            ArrayList<User> users, String username, String password) {
        // 由你实现
        User user=findUser(users, username);
        if(user==null){
            System.out.println("用户不存在");
            return;
        }else{
            if(password.equals(user.getPassword())){
                System.out.println("登录成功");

            }else {
                System.out.println("登录错误");
            }
        }
    }
    public static boolean register(ArrayList<User> users, String username, String password) {
        // 由你实现
        /* 本题先只检查用户名是否重复，不增加格式校验：
    1. 调用 findUser 查找用户名。
    2. 如果已存在，打印“用户名已存在”，返回 false。
    3. 如果不存在，创建 User 对象并添加到 users，打印“注册成功”，返回 true。
    返回 true 表示确实添加了用户，返回 false 表示没有添加。*/
        if(findUser(users, username)==null){
            User user=new User(username,password);
            users.add(user);
            System.out.println("注册成功");
            return  true;
        }
        else {
            System.out.println("用户名已存在");
            return false;
        }
    }




}
