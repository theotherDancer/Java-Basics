# Java 基础语法学习记录

这是我学习 Java 基础语法的练习代码仓库，用来记录每个知识点的动手练习。

- 语言：Java（JDK 25）
- IDE：IntelliJ IDEA
- 工程模块：Hello World
- 代码位置：`src/`，按知识点分包

## 知识点索引

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.test | HelloWorld.java | 第一个程序、类与 main 方法结构 |
| com.variable | VariableDemo1.java | 变量定义（余额示例） |
| com.variable | VariableDemo2.java | 变量综合应用：英雄属性与伤害计算 |
| com.variable | VariableDemo3.java | 多个变量的声明与赋值 |
| com.variable | VariableDemo4.java | 八种基本数据类型（byte/short/int/long/char/boolean/float/double） |
| com.variable | Variable5.java | double 运算：BMI 计算 |
| com.variable | Variable6.java | 变量求和（余额合计） |
| com.variable | VariableDemo6.java | Scanner 键盘录入 int/double/String |
| com.variable | VariableDemo7.java | 键盘录入两个整数求和 |
| com.variable | VariableDemo8.java | 键盘录入身高体重算 BMI |
| com.operator | OperatorDemo1.java | 算术运算符 `+ - * / %`（整数与小数） |
| com.operator | OperatorDemo2.java | 取余 `%`：三位数拆个/十/百位 |
| com.operator.Operator | OperatorDemo3.java | 秒数换算为时/分/秒 |
| com.operator.Operator | OperatorDemo4.java | byte/short 自动提升为 int |
| com.operator.Operator | OperatorDemo5.java | 强制类型转换与混合运算 |
| com.operator.Operator | OperatorDemo6.java | char 参与运算：大写转小写 |
| com.operator.Operator | OperatorDemo7.java | 比较运算符：判断谁更高 |
| com.operator.Operator | OperatorDemo8.java | 四位数回文判断 |
| com.operator.Operator | OperatorDemo11.java | 逻辑运算符：判断「7 的有缘数」 |
| com.operator.Operator | OperatorDemo12.java | 三元运算符 |
| com.ifDemo | ifDemo1.java | if / else if / else 判断正负零 |
| com.ifDemo | ifDemo2.java | if 练习（空白模板） |
| com.Method | MethodDemo1.java | 方法定义、参数与返回值 |
| com.Method | MethodDemo2.java | 方法 + 双重循环（九九乘法表） |
| com.array.array | Demo1.java | 数组定义、下标访问与遍历 |
| com.array.array | Demo2.java | Scanner 录入数组并遍历 |
| com.array.array | Demo3.java | 数组查找元素所在位置 |
| com.array.array | Demo4.java | 数组乱序（随机洗牌） |
| com.array.array | Demo5.java | 随机数去重后存入数组 |
| com.array.array | Demo6.java | 快慢指针去除有序数组重复元素 |

## 运行方式

每个类都带 `main` 方法，用 IDEA 直接点绿色三角运行即可；命令行方式：

```bash
cd src
javac com/test/HelloWorld.java
java com.test.HelloWorld
```

> 说明：本仓库使用 JDK 25，部分文件采用「灵活 main 方法」写法（`static void main()` 或省略 `public`），这是 JDK 21+ 才支持的新特性。

## 学习进度

- [x] 变量与数据类型
- [x] 运算符
- [x] 键盘录入 Scanner
- [x] if 分支
- [x] 方法
- [x] 数组
- [ ] 面向对象（类与对象）
- [ ] 集合
- [ ] IO 与异常
