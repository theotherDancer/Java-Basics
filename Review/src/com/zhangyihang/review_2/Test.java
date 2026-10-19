package com.zhangyihang.review_2;

public class Test {
    static void main(String[] args) {
       //String s="明天交作业";
       /* notifyUser(new EmailNotification(),s);
        notifyUser(new SmsNotification(),s);
        notifyUser(new AppNotification(),s);*/
      /*  Notification[]arr={new AppNotification(),new EmailNotification(),new SmsNotification()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].send(s);*/
        Notification[] arr = {
                new AppNotification(),
                null,
                new EmailNotification(),
                new SmsNotification()
        };
        notifyAll(arr, "明天交作业");








    }
    public static void notifyUser(Notification notification, String message) {
        // 在这里发送通知

        notification.send(message);
    }
    public static void notifyAll(
            Notification[] notifications, String message) {
        // 由你实现
        for (int i = 0; i < notifications.length; i++) {
            if(notifications[i]==null){
                continue;
            }
            notifyUser(notifications[i],message);
        }
    }



}
