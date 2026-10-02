# Java 学习记录

记录我学习 Java 的练习代码，按学习顺序：基础语法 → 面向对象 → 继承 → 多态。

- 语言：Java（JDK 25）
- IDE：IntelliJ IDEA
- 学习时间：基础语法、面向对象、继承均为国庆节（10 月 1 日）之前；多态为国庆节之后

## 目录一览

| 目录 | 主题 | 学习时间 |
| --- | --- | --- |
| 根目录 `src/` | 基础语法：变量、运算符、分支、方法、数组 | 国庆节前 |
| `oop/` | 面向对象：类与对象、封装、构造方法、工具类、枚举、final | 国庆节前 |
| `oop_extends/` | 继承：extends、方法重写、super、继承中的构造方法 | 国庆节前 |
| `Poly/` | 多态：父类引用指向子类对象、instanceof、类型转换 | 国庆节后 |

> 每个子目录都是独立的 IDEA 工程（各自带 `.iml` 与 `src/`）。

## 知识点索引

### 一、基础语法（根目录 `src/`）

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

### 二、面向对象 `oop/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.oop.test1 | Dog.java、Test.java | 类与对象：成员变量、创建对象 |
| com.oop.test2 | Teacher.java、test.java | 类的行为（方法）与调用 |
| com.oop.test3 | Dog.java、test.java | 封装：`private` + get/set，数据校验 |
| com.oop.test4 | student.java、test.java | 封装与 `this` 关键字 |
| com.oop.test5 | student.java、test.java | 构造方法（有参构造初始化对象） |
| com.oop.toolclasstest | Arrayutil.java、Test.java | 工具类：私有构造 + 静态方法 |
| com.oop.finaltest | Circle.java、testcircle.java | `final` 常量、圆的面积与周长 |
| com.oop.Enumtest | Orderstate.java、test.java | 枚举 `enum`（带属性与构造方法） |

### 三、继承 `oop_extends/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.OopExtendTest1 | Person.java、Student.java、Teacher.java、Test.java | 继承 `extends`：抽取父类、子类特有属性/行为 |
| com.OopExtendTest2 | SmartDevice.java、Phone.java、Apple.java、Android.java、Laptop.java、Test.java | 多层继承、方法重写 `@Override` |
| com.OopExtendTest3 | Person.java、Student.java、Test.java | 继承中的构造方法、`super(...)` |

### 四、多态 `Poly/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.test1 | Person.java、Student.java、Teacher.java、Admin.java、system.java、Test.java | 多态：父类引用指向子类对象、方法重写 |
| com.test2 | Vehicle.java、car.java、bicycle.java、person.java、Test.java | 多态作参数、`instanceof` 判断、强制类型转换 |

## 运行方式

每个子目录都是独立工程，在 IDEA 中打开对应目录，点绿色三角运行带 `main` 方法的类即可。命令行示例：

```bash
# 基础语法
cd src
javac com/test/HelloWorld.java
java com.test.HelloWorld
```

> 说明：本仓库使用 JDK 25，部分文件采用「灵活 main 方法」写法（`static void main()` 或省略 `public`），这是 JDK 21+ 才支持的新特性。

## 学习进度

- [x] 基础语法（变量 / 运算符 / 分支 / 方法 / 数组）
- [x] 面向对象（封装、构造方法、工具类、枚举、final）
- [x] 继承（extends、方法重写、super）
- [x] 多态（instanceof、类型转换）
- [ ] 接口与抽象类
- [ ] 集合框架
- [ ] IO 与异常
