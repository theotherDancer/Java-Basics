package com.zhangyihang.review_2;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("发送邮件："+message);
    }
}
