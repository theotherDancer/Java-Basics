package com.zhangyihang.WebSpider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//这是本地爬取
public class Test1 {
    static void main(String[] args) {
        //Pattern:表示正则表达式
        //Matcher：按照正则表达式的规则读取字符串，且从头开始读取
        //捕获JDKxx：JDK\s*(\d+)?
        String str="JDK 27 is the latest release of the Java SE Platform.\n" +
                "\n" +
                "JDK 25 is the latest Long-Term Support (LTS) release of the Java SE Platform.\n" +
                "\n" +
                "JDK 21 is the previous Long-Term Support (LTS) release of the Java SE Platform.\n" +
                "\n" +
                "Earlier JDK versions are available below.";
        //获取正则表达式的对象
        Pattern P=Pattern.compile("JDK\\s*(\\d+)?");
        //m:文本匹配器的对象
        Matcher m=P.matcher(str);//m要在str中寻找符合P规则的小串
        //m从头开始检索，如果没有符合要求的内容，则返回false；若有，则返回true，并记录下头和尾+1的索引

        //这个方法会根据记录的索引，进行字符串的截取
       while(m.find()){
        String s1=m.group();
        System.out.println(s1);
        //请注意，这个过程在 初次 遇到符合要求的内容时就停止,  因此我们需要使用循环
       }
}
}
