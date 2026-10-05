package com.zhangyihang.ui;

import com.zhangyihang.domain.User;

import java.util.ArrayList;
import java.util.Scanner;



public class Login {
    //这个类是登录方法（以控制台的形式打开）
    public void start(){
        System.out.println("游戏的登录注册页面打开了~");
        ArrayList<User>list=new ArrayList<>();
        //ctrl+alt+T,选择对应的语句进行包裹代码
        //选择登录注册
       while(true) {
           System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
           System.out.println("🎮 欢迎来到文字格斗游戏 🎮");
           System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
           System.out.println("请选择操作：1登录 2注册 3退出");
           Scanner sc = new Scanner(System.in);
           String choose = sc.next();
           switch (choose) {
               case "1" -> login(list);
               case "2" -> register(list);
               case "3" -> {
                   //^注意：退出操作（停止虚拟机运行）里面可以选择0或者非0，0表示正常停止
                   System.out.println("用户选择了退出操作");
                   System.exit(0);
               }
               default -> System.out.println("用户的操作有误~");
           }//注意：这个循环体是嵌套在start方法里面的
       }
        //注意login方法不能写在这里，因为方法里面不能定义方法，要写在start的花括号外面
        }//登录的操作如下
        public void login(ArrayList<User>list){
        System.out.println("用户选择了登录操作");
        }//注册的操作如下
        public void register(ArrayList<User>list){
        System.out.println("用户选择了注册操作");
        //1.首先创建一个用户对象（空参）
        User u=new User();
        //2.键盘录入用户名
            Scanner sc=new Scanner(System.in);
while(true) {
    //检查用户名是否符合要求:
    // 开发细节：先验证格式，再验证唯一**因为验证唯一性需要调用数据库
    //1.由数字和字母组成，不能只是数字
    //2.用户名在3-16位，
    //3.用户名唯一
    //u.setUsername
    System.out.println("请输入用户名：");
    String username = sc.next();
    if (!checklen(3,16,username)) {
        System.out.println("用户名需在3-16位，请重新输入");
        continue;
    }
    if(!checkUsername(username)){
        System.out.println("由数字和字母组成，不能只是数字，请重新输入");
        continue;
    }
    if(contains(list,username)){
        System.out.println("该用户已注册");
        continue;
    }//当代码执行到这里，说明长度，格式，唯一性均符合要求
    u.setUsername(username);
    break;
}
            //3.键盘录入密码
            //检查密码是否符合要求
            //u.setPassword
            while(true){
                System.out.println("请输入密码");
            String password1= sc.next();
            System.out.println("请再次输入密码");
            String password2= sc.next();
            if (!(checklen(3,8,password1))){
                System.out.println("密码的长度必须在3-8位之间，请再次输入：");
                continue;
            }
        if (!checkpassword(password1)){
            System.out.println("密码只能是字母加数字的组合，不能有其他字符");
            continue;
        }
        if(!(password1.equals(password2))){
            System.out.println("两次密码不一致，请重新输入");
            continue;
        }
        u.setPassword(password1);
        break;
        }


        //4.把user对象添加到集合中
            list.add(u);
        //5.提示注册成功
            System.out.println("用户注册成功~~");
        }
        //这是一个检验长度的方法
        public boolean checklen(int minlen,int maxlen,String str){
        return str.length()>=minlen&&str.length()<=maxlen;
        }
        //这是一个检验格式的方法
        public boolean checkUsername(String username){
        //字母至少有一个
            // 数字可有可无
                //其余一个也不能有
         int[]arr=getCount(username);//0字母的个数 1数字的个数 2其他的个数
            return arr[0]>0&&arr[2]==0;
        }
        //这是一个检验用户名是否存在的方法
    public boolean contains(ArrayList<User>list,String username){
        for (int i = 0; i < list.size(); i++) {
           User u= list.get(i);
           if(u.getUsername().equals(username)){
               return true;
            }
        }
        return false;
        /*1.return —— 结束整个方法，把值交回给调用方。方法里它后面的代码都不跑了。
          2. break —— 只结束当前这层循环，方法继续往下走。
          3. continue —— 只结束本次循环，接着下一次迭代。*/
    }
    //这是一个判断出现次数的方法的方法
    public int[] getCount(String userInfo){
        int charcount=0;
        int numcount=0;
        int othercount=0;
        for (int i = 0; i < userInfo.length(); i++) {
            char c= userInfo.charAt(i);
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                charcount++;
            } else if(c>='0'&&c<='9'){
                numcount++;
            }else {
                othercount++;
            }
        }
        return new int[]{charcount,numcount,othercount};
    }
    public boolean checkpassword(String password){
        int arr[]=getCount(password);
        return arr[0]>0&&arr[1]>0&&arr[2]==0;
    }
}
