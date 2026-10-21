package com.zhangyihang.collections.set;

// 第一轮实验：暂不重写 equals 和 hashCode，观察默认去重规则。
public class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
            if(obj==null|| getClass() != obj.getClass()){
                return false;
            }
            Student other=(Student)obj;
            if(this.studentId.equals(((Student) obj).studentId)){
                return true;
            }
            return false;
    }

    @Override
    public int hashCode() {
        return this.studentId.hashCode();
    }
}
