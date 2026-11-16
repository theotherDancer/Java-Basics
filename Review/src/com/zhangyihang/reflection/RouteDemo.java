package com.zhangyihang.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
//这种注解要保留到程序运行时，让 Java 代码能用反射读到它。
@Retention(RetentionPolicy.RUNTIME)
// 定义 Route 注解。value() 是注解元素，类型为 String。
@interface Route {
    String value();
    String method();
}

public class RouteDemo {

    @Route(value ="/students",method="GET")
    public String findAll() {
        return "查询成功";
    }
    @Route(value ="/students",method="POST")
    public String create(){
        return "新增成功";
    }
    public static void main(String[] args) throws ReflectiveOperationException {
        // 用字符串模拟浏览器请求中的路径和请求方法
        String requestPath = "/students";
        String requestMethod = "POST";
        RouteDemo controller = new RouteDemo();
        // 遍历 RouteDemo 类自己声明的方法。
        for (Method method : RouteDemo.class.getDeclaredMethods()) {
            // 读取当前方法上的 @Route 注解。没有该注解时返回 null。
            Route route = method.getAnnotation(Route.class);
            if (route != null && requestPath.equals(route.value())
                    && requestMethod.equals(route.method())) {
                // 方法有 @Route 注解且路径匹配时，在 controller 对象上调用它。
                Object result = method.invoke(controller);
                System.out.println(result);
            }
        }
    }
}