package com.zhangyihang.WebSpider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    static void main(String[] args) {
        String str="Java 27, Java 25, Java 21, and earlier versions available now\n" +
                "Learn about Java SE Subscription\n" +
                "jDK 27 is the latest release of the Java SE Platform.\n" +
                "JDK 25 is the latest Long-Term Support (LTS) release of the Java SE Platform.\n" +
                "JDK 21 is the previous Long-Term Support (LTS) release of the Java SE Platform.\n" +
                "Earlier JDK versions are available below.";
        Pattern P = Pattern.compile("(?i)JDK(?=\\s*\\d+)");
        Matcher m=P.matcher(str);
        while(m.find()){
            System.out.println(m.group());
            //创建正则表达式，创建文本匹配器，循环重组打印
        }
    }
}
