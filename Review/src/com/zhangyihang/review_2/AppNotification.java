package com.zhangyihang.review_2;

public class AppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("APP通知："+message);
    }
}
