package com.zhangyihang.review_2;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("发送短信："+message);
    }
}
