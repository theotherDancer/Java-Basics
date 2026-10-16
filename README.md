# Java 学习记录

记录我学习 Java 的练习代码，按学习顺序：基础语法 → 面向对象 → 继承 → 多态 → 抽象类 / 接口 / 内部类 → 常用 API → StringBuilder → 集合入门 → 阶段性项目实战 → 常用类（System / Object / 包装类）→ Math / 正则表达式 → 查找算法 → 排序算法 → `java.util.Arrays` 常用 API → 函数式编程 / Lambda → File 类常用 API → IO 流（字节流入门）/ 异常处理（进行中）。

- 语言：Java（JDK 25）
- IDE：IntelliJ IDEA
- 学习时间：基础语法、面向对象、继承均为国庆节（10 月 1 日）之前；多态为国庆节之后

## 目录一览

| 目录 | 主题 | 学习时间 |
| --- | --- | --- |
| 根目录 `src/` | 基础语法：变量、运算符、分支、方法、数组 | 国庆节前 |
| `oop/` | 面向对象：类与对象、封装、构造方法、工具类、枚举、final | 国庆节前 |
| `oop_extends/` | 继承：extends、方法重写、super、继承中的构造方法 | 国庆节前 |
| `Poly/` | 多态、抽象类、接口、内部类 | 国庆节后 |
| `API/` | 常用 API：Random、String、StringBuilder、ArrayList | 2026-10-03 ~ 10-04 |
| `TestFightGame/` | 阶段性项目：控制台文字格斗游戏（登录 / 注册） | 2026-10-05（进行中） |
| `api-code/` | 常用类 `Math`、正则表达式与网络爬虫入门 | 2026-10-06 ~ 10-07 |
| `search_code/` | 查找算法：基本查找、二分查找、分块查找 | 2026-10-07 ~ 10-08 |
| `Sort_Code/` | 排序算法：冒泡 / 选择 / 插入 / 快速排序、递归 | 2026-10-08 ~ 10-09 |
| `MyAPI/` | `java.util.Arrays` 常用 API、Lambda 表达式入门 | 2026-10-11（lambda 进行中） |
| `Myfile/` | `java.io.File` 常用 API：创建 / 判断 / 删除 / 时间戳 / 递归遍历 | 2026-10-14 ~ 10-15（IO 进行中） |
| `MyIO/` | IO 流：字节输出流 / 输入流（写入、续写、读取） | 2026-10-15 ~ 10-16（IO 进行中） |

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

### 四、多态与抽象 / 接口 `Poly/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.test1 | Person.java、Student.java、Teacher.java、Admin.java、system.java、Test.java | 多态：父类引用指向子类对象、方法重写 |
| com.test2 | Vehicle.java、car.java、bicycle.java、person.java、Test.java | 多态作参数、`instanceof` 判断、强制类型转换 |
| com.Abstracttest3 | Animal.java、Cat.java、Test.java | 抽象类 `abstract`、抽象方法、子类实现 |
| com.Interface | Animal.java、Fork.java、swim.java、Test.java | 接口 `interface`、`implements`，抽象类 + 接口组合使用 |
| com.InnerClass | Swim.java、Test.java | 匿名内部类：一次性实现接口，省去单独建类 |

### 五、常用 API `API/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.APITest1 | Test.java | `java.util.Random`：`nextDouble()` / `nextInt()`、指定范围的随机数 |
| com.StringTest2 | Test.java | String 的五种创建方式（直接赋值、`new`、char[]、byte[]） |
| com.StringTest3 | Test.java | 字符串比较 `equals` + 登录模拟（3 次机会） |
| com.StringTest3 | Test2.java | 字符串遍历 `length()` + `charAt()` |
| com.StringTest3 | Test3.java | 统计字符串中大写 / 小写 / 数字的个数 |
| com.StringTest3 | Arrayutil.java | 工具类：`arrayToString` 把 int 数组拼接成字符串 |
| com.StringTest3 | Test4.java | 调用工具类将 int 数组转为字符串输出 |
| com.StringTest4 | Sub.java | `substring` 截取、`charAt`，手机号脱敏（保留首字符 + `***`） |
| com.StringTest5 | Replace.java | `replaceAll` 敏感词自动替换 |
| com.contains_ | TEST.java | String 查找/判断：`contains` / `startsWith` / `endsWith` / `indexOf` / `lastIndexOf` / `isEmpty` / `toCharArray` / 大小写转换 |
| com.StringBuilderDemo | Test1.java | 字符串拼接的性能问题（循环 `+=` 反复新建对象，很慢） |
| com.StringBuilderDemo | Test2StringBuilder.java | `StringBuilder`：构造、`append`、`length`、`toString` |

### 六、集合入门 `API/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.ArrayListDemo | Test1.java | `ArrayList` 集合：`add` / `set` / `get` / `size` / 遍历（长度用 `size()` 而非 `length`） |

### 七、阶段性项目：文字格斗游戏 `TestFightGame/`（进行中）

把前面所学（面向对象、集合、String、控制台交互）串起来做的第一个**综合项目**，从控制台登录 / 注册入口开始搭。

| 包 | 文件 | 说明 |
| --- | --- | --- |
| （默认包） | APP.java | 启动类：创建 `Login` 并调用 `start()` |
| com.zhangyihang.domain | User.java | 用户实体：id / username / password / status，id 由系统随机生成 |
| com.zhangyihang.ui | Login.java | 控制台界面：登录 / 注册 / 退出；用户名长度（3~16 位）与格式（字母开头、不能纯数字）校验 |

> 状态：**进行中，尚未完成**（注册流程还需完善）。今天没有新学知识点，主要是综合运用已有内容。

### 八、常用类 `Math` `api-code/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.mathTest | MathTest1.java | `Math` 工具类（静态、不能 new）：`abs` / `ceil` / `floor` / `round` / `pow` / `sqrt` / `cbrt` / `random` |

### 九、正则表达式与网络爬取入门 `api-code/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.WebSpider | Test1.java | `Pattern` / `Matcher`：`find()` 循环取值，捕获 `JDK\s*(\d+)?` |
| com.zhangyihang.WebSpider | Test2.java | `java.net.URL` 网页爬取入门（占位练习，未完成） |
| com.zhangyihang.WebSpider | Test3.java | 忽略大小写 `(?i)` + 零宽前瞻 `(?=\s*\d+)`：只匹配 `JDK` 不带版本号 |
| com.zhangyihang.WebSpider | Test4.java | `replaceAll` / `split` 按正则替换与切割 |

### 十、查找算法 `search_code/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.search | BasicSearch1.java | 基本查找：从 0 索引开始逐个比较，找到返回 `true` |
| com.zhangyihang.search | BinarySearch.java | 二分查找：要求数组有序，用 `min` / `max` / `mid` 折半收缩，找不到返回 `-1` |
| com.zhangyihang.search | BlockSearch.java | 分块查找（索引顺序查找）：先用索引表 `block[]` 按 `min~max` 定位到块，再在该块 `startIndex~endIndex` 内顺序查找 |

### 十一、排序算法 `Sort_Code/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.mysort | a01_BubbleSort.java | 冒泡排序：相邻两两比较、左大于右就交换；外层 `n-1` 轮，内层 `n-1-i` 次 |
| com.zhangyihang.mysort | a02_SelectionSort.java | 选择（交换）排序：外层固定 `i`，内层用 `j = i+1 .. 末尾` 逐个比较，每轮把最小的选到 `i` 位 |
| com.zhangyihang.mysort | a03_InsertSort.java | 插入排序：把当前元素往左拽，比左边小就交换、`j--`，直到碰壁（左边本来是有序区） |
| com.zhangyihang.mysort | a04_Recursion.java | 递归：求 1~100 的和（`getSum`）+ 阶乘（`gatFactorial`，尚未改成 `long`） |
| com.zhangyihang.mysort | a05_quicklySort.java | 快速排序：基准 + 双指针分区（右指针先动）+ 对左右两半递归 |

### 十二、Arrays 常用 API 与 Lambda 入门 `MyAPI/`

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.TestAPI | MyArraysDemo1.java | `java.util.Arrays` 常用方法：`toString` 拼接、`binarySearch` 二分查找（需先有序）、`copyOf` / `copyOfRange` 复制、`fill` 填充、`sort` 排序；用「取负 → 排序 → 再取负」实现降序 |
| com.zhangyihang.TestLambda | LambdaDemo1.java | 接口 + 匿名内部类实现接口、`method(Swim s)` 演示接口作参数（回调）、Lambda 表达式入门（`method(() -> {...})`）（**进行中，尚未学完**） |

### 十三、`File` 类常用 API 与 IO 入门 `Myfile/`

`java.io.File` 的练习，独立工程 `Myfile/`；`FileDemo1~6` 写在**默认包**（无 `package` 声明），`Test1~3` 放在 `com.zhangyihang.Test`。

| 文件 | 知识点 |
| --- | --- |
| FileDemo1.java | `new File(String)` 与 `new File(parent, child)` 两种构造路径的方式、打印 `File` 对象 |
| FileDemo2.java | `isDirectory()` / `isFile()` / `exists()` 判断；路径不存在时三者全为 `false` |
| FileDemo3.java | `length()` 文件字节数（对文件夹无意义）、`getAbsolutePath()` 绝对路径、`getName()`、`lastModified()` 毫秒时间戳 |
| FileDemo4.java | `createNewFile()` 创建文件：不存在→`true`、已存在→`false`；方法签名 `throws IOException` |
| FileDemo5.java | `delete()` 删除文件：成功返回 `true` |
| FileDemo6.java | `listFiles()` 列出目录下的**直接子项**（返回 `File[]`），配增强 for 遍历 |
| com.zhangyihang.Test / Test1.java | `mkdirs()` 建目录 + `createNewFile()` 建文件；相对路径基于项目根（多写一层就“找不到路径”） |
| com.zhangyihang.Test / Test2.java | 把查找封成方法：判断某个文件夹下是否存在 `.avi` 文件（`isFile()` + `endsWith()`） |
| com.zhangyihang.Test / Test3.java | **递归**遍历文件夹找所有 `.avi`：`listFiles()` 判 `null` + 递归进入子目录 |

### 十四、IO 流（字节流入门）`MyIO/`

新工程 `MyIO/`，开始学 `java.io` 的**流**：方向和「程序」有关——数据**进程序**叫输入流、**出程序**叫输出流。

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.bytestream | ByteStreamDemo1.java | 字节**输出流** `FileOutputStream`：构造参数可以是文件名字符串或 `File` 对象；文件不存在会创建（父目录须存在）、已存在会**先清空**；`write(int)` 写一个字节、`close()` 释放资源 |
| com.zhangyihang.bytestream | ByteStreamDemo3.java | `write(byte[])` 一次写整个数组；`write(byte[], off, len)` 写数组的一部分，第三个参数是**长度** |
| com.zhangyihang.bytestream | ByteStreamDemo4.java | `FileOutputStream(file, true)` **续写**模式；`getBytes(StandardCharsets.UTF_8)` 字符串转字节；`\r\n` 写 Windows 换行 |
| com.zhangyihang.bytestream | ByteStreamDemo5.java | 字节**输入流** `FileInputStream`：`read()` 返回一个字节值，读完返回 `-1` |
| com.zhangyihang.bytestream | ByteStreamDemo6.java | 循环读取：`while ((b = fis.read()) != -1) { ... }` |

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
- [x] 抽象类、接口、内部类
- [x] 常用 API（Random、String）
- [x] StringBuilder
- [x] 集合入门（ArrayList）
- [x] 综合练习：控制台文字格斗游戏（进行中）
- [x] 常用类：System、Object、包装类
- [x] 常用类：Math（数学工具类）
- [x] 正则表达式（Pattern / Matcher）
- [x] 查找算法：基本查找 / 二分查找 / 分块查找
- [x] 排序算法：冒泡 / 选择 / 插入 / 快速排序
- [x] 递归（求和、阶乘）
- [x] 常用 API：Arrays（toString / binarySearch / copyOf / copyOfRange / fill / sort、降序）
- [ ] 函数式编程 / Lambda 表达式（进行中）
- [ ] 集合框架（进阶）
- [x] IO 入门：`File` 类常用 API（创建 / 判断 / 删除 / 时间戳 / `listFiles()`）
- [x] IO 入门：递归遍历目录、找某类文件
- [x] IO 入门：字节输出流 `FileOutputStream`（`write(int)` / `write(byte[])` / 续写 `append`）
- [x] IO 入门：字节输入流 `FileInputStream`（`read()`，读完返回 `-1`）（2026-10-16，**进行中**）
- [ ] IO 流进阶：字符流、缓冲流、转换流
- [ ] 异常处理（`throw` / `throws` / `try-catch`）（刚接触概念）

## 学习笔记（2026-10-06）：System / Object / 包装类

### System 类

1. `java.lang.System` 是 **final 类 + 私有构造**，不能 `new`，只能用它的**静态成员**。
2. 常用：`System.out.println(...)` / `print(...)`（标准输出，`out` 是一个 `PrintStream`）；`System.exit(0)`（退出 JVM，0 正常、非 0 异常终止）；`System.currentTimeMillis()`（当前毫秒时间戳，常用来算耗时）；`System.arraycopy(...)`（高效数组复制）；`System.getProperty("os.name")`（系统属性）、`System.getenv(...)`（环境变量）。

### Object 类

1. 所有类的**根父类**：`class A {}` 等价于 `class A extends Object {}`。
2. 被子类经常重写的方法：`toString()`（默认输出 `类名@哈希十六进制`，就是之前 `[C@xxx` 那个规则；`println(对象)` 会自动调用它）；`equals(Object)`（默认比地址；重写后比内容，如 `String` / `Integer`）；`hashCode()`（哈希值，**重写 `equals` 就要一起重写 `hashCode`**，集合去重要用）；`getClass()`（取运行时类型，反射用）。
3. 为什么重要：多态、集合去重、打印对象、对象比较，都建立在这一层之上。

### 包装类

1. 8 种基本类型各有一个包装类：`int→Integer`、`char→Character`、`double→Double`……（其余首字母大写）。
2. 价值：集合 / 泛型只能装对象（`ArrayList<Integer>`）；自带工具方法与常量（`Integer.parseInt`、`Integer.MAX_VALUE`）；可表示 `null`。
3. 自动装箱 / 拆箱：`Integer i = 10;`（装箱）、`int x = i;`（拆箱）。
4. 两个坑：`==` 只缓存 **-128~127**（比“值”要用 `equals`）；`null` 拆箱会 **NPE**。
5. 扩展：超大整数用 `BigInteger`，精确小数（如金额）用 `BigDecimal`；`double` 有精度误差、算钱会出错；`BigDecimal` 比较用 `compareTo`，除法要指定精度和舍入模式。

## 踩坑经验总结（2026-10-05）

写「文字格斗游戏」时踩的坑。每条只讲一个点：**现象 → 结论**。

### 结构 / 括号

1. **方法只能写在类的直接层级**：不能在方法里再定义方法（报 `illegal start of expression`），也不能写在类外面（报 `class, interface, enum, or record expected`）。
2. **花括号必须配对**：多一个或提前闭合的 `}`，后面的方法就「掉到类外面」。写完按 `Ctrl + Alt + L` 格式化，层次一眼看清。
3. **同一个方法里局部变量不能重名**：报 `variable xxx is already defined`；方法级和循环块内的同名也不行。

### 方法 / 参数 / 返回值

4. **返回类型必须和 `return` 一致**：`void` 方法不能 `return 值`（报 `unexpected return value`）。
5. **`return` 结束的是整个方法，不是循环**：`return` 结束方法 / `break` 结束循环 / `continue` 跳过本次。
6. **`return false` 要放在循环外面**：放里面会报 `missing return statement`，而且只检查第一个元素。规则：循环里找到就 `return true`，循环外都找完才 `return false`。
7. **形参 vs 实参**：定义时写「类型 + 名字」（形参），调用时只写对象（实参）；`ArrayList<User> list = new ArrayList<>()` 里的 `list` 是变量名，不是实参。

### 逻辑

8. **字符比较要用字符字面量**：判断数字写 `c >= '0' && c <= '9'`，别写 `c >= 0 && c <= 9`（那是拿编码值比较，永远判不出数字）。
9. **集合装的是对象**：`ArrayList<User>` 里 `list.contains("字符串")` 永远返回 `false`，要遍历比较 `getUsername()`。
10. **防空指针**：`x.equals(u.getUsername())` 比 `u.getUsername().equals(x)` 安全（后者用户名是 `null` 会崩）。

### 常用 API

11. **`Random` 的构造参数是种子（long）**：同种子序列可复现；`java.util.Random` 是伪随机，安全场景用 `SecureRandom`。

### 学习方向（AI 时代）

12. **语法 / API 可以少背，判断力必须自己练**：细节多交给 AI，但「读代码、调试、判断对错、设计结构」得自己来——今天的坑几乎都是结构与逻辑问题。

## 踩坑经验总结（2026-10-07）

学正则表达式和查找算法时踩的坑。每条只讲一个点：**现象 → 结论**。

### 正则 / Matcher

13. **`find()` 是消费式的**：每调用一次才向后推进一格；正确写法是 `while (m.find()) { ... }`。
14. **别用 `while (b)` 配一次性 `find()`**：写了 `boolean b = m.find(); while (b) { ... }` 而循环里从不更新 `b`，`b` 永远为 `true`，`group()` 永远返回同一个匹配 → 死循环。
15. **进循环前多调一次 `find()` 会「吃掉」第一个匹配**：循环前写了 `boolean b = m.find();` 又用 `while (m.find())`，结果第一个 `JDK 27` 消失。
16. **想「匹配但不消耗」用零宽前瞻**：`(?i)JDK(?=\s*\d+)` 只匹配 `JDK`，版本号留给前瞻去「看」。
17. **忽略大小写**：正则开头加 `(?i)`，或 `Pattern.compile(re, Pattern.CASE_INSENSITIVE)`。
18. **只要带数字的版本号，去掉可选组**：`JDK\s*(\d+)?` → `JDK\s*(\d+)`。
19. **`replaceAll` / `split` 的形参名是 regex 就按正则解析**：`split("[A-Za-z0-9]+")` 按「字母数字串」切割。

### 结构 / IDEA

20. **方法必须写在类的花括号内部**：写到类外面（`}` 之后）会报 `class, interface, enum, or record expected`。
21. **包名要和目录对应**：文件放在 `src\com\zhangyihang\search\` 下，第一行就要写 `package com.zhangyihang.search;`，否则报「包名与文件路径不对应」。
22. **方法名不要和类名重名**：容易和构造器混淆（如方法也叫 `BasicSearch1`），改用小驼峰。

## 踩坑经验总结（2026-10-08）

学查找 / 排序算法时踩的坑，以及当天问到的几个概念。每条只讲一个点：**现象 → 结论**。

### 结构与编译

23. **大括号提前闭合，报错位置会很离谱**：`BlockSearch` 在第 21 行就 `}` 结束，`findBlock` / `getIndex` 掉到类外；JDK 25 把这种「顶层方法」当**紧凑源文件**解析，于是报错落在**第 1 行**「压缩源文件不应有程序包声明」，跟真实原因完全对不上。**报错位置离谱时，先数括号。**
24. **类名不能当对象用**：写 `block.getMin` 报「找不到符号 / 符号: 变量 getMin / 位置: 类 BlockSearch.block」；写 `block.getMin()` 也不行——**实例方法只能由对象调用**，类名只能调静态成员。
25. **`private` 成员跨类访问不到**：`blockArr[i].min` 报「min 在 block 中是 private 访问控制」；同类里访问别人的私有方法、跨包访问包级成员同样被拒。要用就通过 `getMin()`。
26. **Java 没有顶层方法，唯一例外是紧凑源文件**：没有 `package` 声明的单文件可以写顶层 `void main()` 并用 `java Demo.java` 运行（JEP 512）；一旦有 `package` 声明就会冲突。

### 逻辑与边界

27. **返回「找不到」用 `null`**：对象类型的惯例，方法注释写清、调用方必须判空；对外 API 可用 `Optional`，只有「不该发生」的情况才抛异常。
28. **循环走完必须有 `return`**：否则报 `missing return statement`；`return block;` 这种把类名当变量写会报「找不到符号」。
29. **循环边界 `<` 漏元素**：`for (int i = b.getStartIndex(); i < b.getEndIndex(); i++)` 漏掉块内最后一个位置——查 48（下标正好是 `endIndex`）永远失败，查 50（`endIndex - 1`）却正常。`endIndex` 是包含语义就得写 `<=`。
30. **「时灵时不灵」的 bug 多半是边界口径不一致**：同一个 `endIndex`，一处当包含、一处当不包含，查不同元素就一个成功一个失败；两处口径要一起统一。
31. **分块查找的前提是「块间有序」**：后一块的所有元素都要大于前一块的最大值；当天数据 22~40 / 13~20 / 7~10 / 43~50 块间是乱的，只能靠 `min` / `max` 区间匹配块，没法用「块最大值 + 二分」加速索引表。
32. **冒泡排序的边界**：外层 `n-1` 轮，内层 `n-1-i`，左 > 右就交换；边界写错不报错，只是结果不对。

### 概念

33. **跨类调用 = 访问权限 + 调用方式**：`private` 本类 / 默认（包级）同包 / `protected` 同包 + 子类 / `public` 全部；实例方法要 `new` 对象，静态方法 `类名.方法()`，跨包要 `import`；静态方法里不能直接用非静态成员。
34. **`private` 的意义在「能不能改」，不在「能不能读」**：只给 getter 不给 setter 就是只读；setter 里能加校验；还能只暴露部分字段、返回防御性副本、`final` 做成不可变对象。**每个字段都无脑配 getter/setter，那才真的等于 public。**
35. **每种查找 / 排序都补三条边界用例**：查第一个、查最后一个、查不存在的元素——当天的 48 就是死在最后一条上。

## 踩坑经验总结（2026-10-09）

学排序算法与递归时踩的坑。每条只讲一个点：**现象 → 结论**。

### 结构与边界

36. **`}break;` 挤在一行会让 `break` 落到 `if` 外面**：成了循环体最后一句，导致**第一轮就无条件退出**（原本要做的「找第一个无序位置」永远不执行）。括号与 `break` 分行写、再用 `Ctrl+Alt+L` 格式化就能一眼看出。
37. **循环条件要与下标配套**：`i < arr.length` 却用 `arr[i+1]`，数组**本身已有序**时会访问 `arr[length]`，实测 `ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5`；要写 `i < arr.length - 1`。
38. **区间循环用 `<` 而不是 `!=`**：`while (start != end)` 只是靠内层保护才没出事，条件一改就可能死循环。

### 递归

39. **递归三要素**：出口（最小规模直接给答案）、规模缩小（每层朝出口逼近）、递推关系（当前 + 更小规模的同类问题）；执行分「递」（逐层压栈）和「归」（从出口往回算）两段。
40. **出口条件要挡住所有不用干的区间**：区间长度 `j - i + 1`，不用排就是「长度 ≤ 1」，即 `if (i >= j) return;`；只写 `>` 会漏掉单元素，实测递归调用次数 21 → 13。
41. **出口必须在方法第一行**（在任何 `arr[i]` 之前）：写在读取之后，遇到空区间就先越界了——这就是快排第二次报 `ArrayIndexOutOfBoundsException` 的原因。
42. **递归参数必须朝「区间变小」的方向传**：左半 `(i, start-1)`、右半 `(start+1, j)`；写成 `(i, start+1)` 右子区间不缩小、变成自己调自己 → `StackOverflowError`（异常栈里同一行重复几百次就是这个信号）。
43. **出口只判 `== 1` 对非法输入不设防**：`getSum(0)` 会一路减到负数 → `StackOverflowError`；应写 `if (number <= 1) return number;` 或开头校验参数。
44. **Java 不做尾递归优化**：递归深度受栈限制，纯靠递归的算法要留意深度。

### 快速排序

45. **忘写递归 = 只分区一次**：分区后必须对左右两半再递归，否则根本没排序（实测输出 `48 6 1 5 7 12 20 64 99 21`）。
46. **基准取最左时，必须右指针先动**：两指针相遇点才会是「≤ 基准」的值；先动左指针会让相遇点变成「≥ 基准」，最后一交换就把大于基准的数放进了左区（实测左区里出现 48 > 20）。记法：从「基准的对面」开始扫。

### 类型与数值

47. **int 溢出是静默的**：`12!` 是 int 上限（479001600），`13! = 6227020800` 起就溢出；溢出时 Java 只保留结果的**低 32 位**（对 2^32 取余）再按**补码**读，最高位是 1 就显示成负数。
48. **20! 为什么是负数**：真值 2432902008176640000 → mod 2^32 = 2192834560 → 它 ≥ 2^31，减去 2^32 = **-2102132736**。里程表类比（实测）：`2147483647 + 1 = -2147483648`、`2147483647 * 2 = -2`。
49. **选类型的标准**：int 约 21 亿（10 位）、long 约 922 亿亿（19 位）；20! 用 long，21! 以上用 `BigInteger`（`b = b.multiply(BigInteger.valueOf(i))`）；想主动检测溢出用 `Math.multiplyExact` / `Math.addExact`。
50. **中间变量也要用宽类型**：「`int r = 1; r *= i;` 再转 long」白搭——乘法早就溢出过了。

### 静态与非静态

51. **`main` 里不能直接调非静态方法**：javac 报「无法从静态上下文中引用非静态 方法 xxx」，要么先 `new` 对象，要么把方法改成 static。
52. **JDK 25 支持实例 `main`**（JEP 512，实测整个类不写 static 也能跑），但兼容性差，正式写法仍是 `public static void main`。
53. **静态与非静态的判断口诀**：方法里用到 `this` 的东西（字段、别的非静态方法）→ 非静态；只靠参数算结果 → static（纯算法方法如 `getSum` 就该 static）。

### 调试方法

54. **一次只改一处、改完立刻重跑**：错误是层层揭开的——修完 `StackOverflowError` 立刻暴露 `ArrayIndexOutOfBoundsException`。
55. **用对照实验定位**：拿 `Arrays.sort` / Python 的 `math.factorial` 当标准答案，比肉眼看快得多；**先看异常栈第一行**指向自己写的哪一行。
56. **边界用例清单**：空数组、单元素、两个元素、全相同、已有序、完全倒序——当天的 bug 几乎都是被其中一种逼出来的。

## 踩坑经验总结（2026-10-11）

学 `java.util.Arrays` 常用 API、接口与 Lambda 入门时踩的坑。每条只讲一个点：**现象 → 结论**。

### 结构 / 语法

57. **匿名内部类作为语句，结尾必须有分号**：`new Swim(){ ... }` 漏掉 `;`，javac 报「需要';'」，定位就指向那个 `}`；写成 `new Swim(){...};` 或直接接 `.swimming();` 即可。
58. **方法不能嵌套定义**：把方法写进 `main` 的方法体里，会报「非法的表达式开始」「方法声明无效; 需要返回类型」，还连带一批错误——**根因只有一个**：方法只能定义在类的直接层级、和 `main` 平级。
59. **`return int[]arr;` 是语法错误**：`int[]arr;` 是声明变量的语句，不能当返回值（javac 报「需要 '.class'」）；直接写 `return arr;`。

### Arrays 常用 API

60. **`Arrays.binarySearch` 要求数组先有序**：对乱序数组用结果没有意义（可能返回负数或错误下标），查找前先 `Arrays.sort`。
61. **`Arrays.copyOf` 的越界行为**：`n` 比原长度**大就补 0**、小就截断；`copyOfRange(arr, from, to)` 是**左闭右开**区间。
62. **`Arrays.fill` 会覆盖整个数组**（包括原有元素）。
63. **Arrays 没有直接降序方法**：①升序后首尾翻转；②「取负 → 升序 → 再取负」——第②种注意 `Integer.MIN_VALUE` 取负会溢出，且会**原地修改传入的数组**。

### 接口 / 多态

64. **接口里可以没有任何抽象方法**：空接口（标记接口，如 `Serializable`）、只放 `default` / `static`（Java 8+）/ `private`（Java 9+）方法的接口都合法。
65. **接口抽象方法是「实现（implement）」，不是「重写（override）」**：接口只声明、没有方法体，不存在「原来的版本」；调用时因**多态 / 动态绑定**执行实现类那一版。

### Lambda / 匿名内部类

66. **Lambda 必须有目标类型**：单独写 `() -> ...;` 编译不过，必须赋给接口变量、强制转换 `(Swim) ...`、或作为函数式接口的参数传给方法。
67. **`method(Swim s)` 这种辅助方法不是必需的**：它只是演示「接口作参数（回调）」，有个目标类型就能用 Lambda。
68. **函数式接口**（只有一个抽象方法的接口，如 `Swim`）的匿名内部类可以简化成 Lambda：`new Swim(){ @Override public void swimming(){...} }` 等价于 `() -> {...}`。

## 踩坑经验总结（2026-10-14）

学 `java.io.File` 常用 API、并顺带搞清「异常的抛出 / 声明 / 捕获」时踩的坑。每条只讲一个点：**现象 → 结论**。

### File 类

69. **`createNewFile()` 遇到「文件已存在」返回 `false`、不抛异常**：已存在是**预期内的正常结果**，不是错误；`IOException` 只留给真正的 IO 错误（父目录不存在、路径是目录、无权限、磁盘故障）。想「已存在就报错」得自己 `throw`。
70. **`createNewFile()` / `delete()` / `mkdir()` 都返回 `boolean`**：用不用返回值要想清楚；同一个文件连调两次 `createNewFile()`、第一次的返回值却不接，就是冗余写法。
71. **`length()` 对文件夹不可靠**：它是「文件字节数」，实测文件夹返回 `0`，拿不到文件夹的真实大小（要自己递归累加）。
72. **`getAbsolutePath()` 的相对路径基于「程序当前工作目录」**：IDEA 里默认是**项目根目录**，不是 `src`。
73. **`lastModified()` 返回 `long` 毫秒时间戳**，要转成日期：老 API 用 `new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(ms))`；新 API 推荐 `Instant.ofEpochMilli(ms).atZone(ZoneId.systemDefault())` + `DateTimeFormatter`。
74. **`getName()` 对文件和文件夹行为不同**：文件返回「名字 + 后缀」，文件夹只返回文件夹名。

### 异常

75. **声明 ≠ 抛出**：方法签名上的 `throws IOException` 只是「声明可能抛」，**不代表真的抛了**；不写它会报**编译期**错误「未报告的异常 java.io.IOException; 必须对其进行捕获或声明以便抛出」。
76. **抛出 vs 捕获**：`throw` / `throws` 是把问题**甩给上层**，`try-catch` 是**自己处理**完接着往下跑；用了 `try-catch`，`main` 上的 `throws` 就可以去掉。
77. **`catch` 从上到下匹配**：子类异常要写在父类前面，否则父类会先接住；不确定就 `catch (Exception e)`，但最好写具体类型。
78. **别用异常控制正常流程**：能用返回值表达的（如 `false`）就别抛异常；异常要构造栈、有开销，只留给「没法继续」的错误。

### 结构 / IDEA

79. **建包时别手滑打成逗号**：`src` 下出现过一个名为 `com.zhangyihang,myfile` 的 **0 字节普通文件**（本意是包 `com.zhangyihang.myfile`）；IDEA 里建包要右键 `New > Package`、名字用**英文句点**分隔。（该文件未提交）
80. **跨类访问：局部变量别的类拿不到**：方法体里 `new` 出来的对象只在本方法内有效；要让别的类用，必须提升为**成员变量**（`public` 或提供 getter），实例成员用 `对象名.字段`、静态成员用 `类名.字段`。

## 踩坑经验总结（2026-10-15）

学 `File` 递归遍历与字节输出流时踩的坑。每条只讲一个点：**现象 → 结论**。

### 路径 / 文件

81. **相对路径多写一层就找不到**：在 MyIO 项目里写 `new File("MyIO")`，实际指向 `<项目根>\MyIO`，该目录不存在 → `createNewFile()` 报 `IOException: 系统找不到指定的路径。`
82. **项目根已经叫 MyIO，就别再写 MyIO**：想建 `<项目根>\a.txt`，直接写 `new File("a.txt")`。**规则：路径里每多一层，就必须有一层真实存在。**
83. **`createNewFile()` 不会建父目录**：父目录不存在就报「系统找不到指定的路径」；要建目录先 `mkdirs()`。`FileOutputStream` 同样不会自动建目录。
84. **`listFiles()` 可能返回 `null`，必须判空**：目录无访问权限、或路径其实是普通文件时都会返回 `null`；不判空就 `for (File f : files)` → `NullPointerException`。
85. **判空判的是返回值，不是入参**：会变 `null` 的是 `listFiles()` 的返回值 `files`；`f` 是 `new File(...)` 造的，不会为 `null`。想知道 `f` 能不能用，用 `isDirectory()` / `exists()`。

### 递归 / 性能

86. **别一上来就扫全盘**：`new File("C:\\")` 递归实测跑了 4 分 20 秒仍未结束，CPU 一直 ~90%，零输出。
87. **先用小目录验证逻辑**：同一套代码扫桌面（870 个目录 / 11547 个文件）只用 1 秒；确认逻辑对了再换大目录。
88. **Windows 目录联接（junction）会被判空跳过**：`C:\ProgramData\Application Data`、`C:\Users\All Users` 都是 `ReparsePoint`，实测 `listFiles()` 返回 `null`（访问被拒），所以不会死循环。
89. **可遍历的联接会让目录被扫两遍**：`C:\Documents and Settings` 是指向 `C:\Users` 的联接且能列出来，等于 `C:\Users` 被扫了两遍。
90. **深度优先递归要防栈溢出**：目录层级极深、或遇到可遍历的联接环，递归可能 `StackOverflowError`；改用队列的广度优先，或 `Files.walkFileTree(...)`。

### IO 流概念

91. **「输入 / 输出」的参照物是「你的程序」**：数据**进程序** = 输入流（调 `read()`），**出程序** = 输出流（调 `write()`）。
92. **写文件 = 输出流**：`FileOutputStream` 把数据从程序写到磁盘，方向是「出程序」；读文件才用输入流 `FileInputStream`。
93. **文件在磁盘上，不属于程序内存**：所以「数据流到文件」依然是「离开程序」，别拿文件的视角去判断方向。
94. **`File` 不负责读写内容**：`File` 只管路径、创建、删除、改名、查属性；读写内容必须用**流**。
95. **流用完必须 `close()`**：否则文件被占用、资源泄漏；以后用 `try-with-resources` 自动关。
96. **「读完了」的信号要判**：字节流 `read()` 返回 `-1`，字符流 `readLine()` 返回 `null`，和 `listFiles()` 的 `null` 一样都是 API 约定。

## 踩坑经验总结（2026-10-16）

学字节输出流 / 输入流时踩的坑与记下的 API 细节。每条只讲一个点：**现象 → 结论**。

### 字节输出流

97. **`FileOutputStream` 会先清空已有文件**：目标文件已存在时，`new FileOutputStream(file)` 会把它**清空再写**（覆盖）；想接着后面写，要传第二个参数 `true`。
98. **父目录不存在照样报错**：路径的父级文件夹不存在时，`FileOutputStream` 同样报「系统找不到指定的路径」；它不会创建目录（和 `createNewFile()` 一样）。
99. **`write(int)` 写的是一个字节**：参数是 ASCII 码，`write(98)` 写出的是字符 `b`。
100. **`write(byte[], off, len)` 的第三个参数是长度**：不是「结束下标」，而是「写几个字节」；`write(bytes, 0, 2)` 只写前 2 个。
101. **续写要传 `append = true`**：`FileOutputStream("a.txt", true)` 才是追加；默认 `false` 就是覆盖。
102. **字符串转字节要指定编码**：`s.getBytes(StandardCharsets.UTF_8)`；不写参数就用平台默认编码，跨平台容易不一致。
103. **Windows 的换行是 `\r\n`**：写换行就写 `"\r\n"`。

### 字节输入流

104. **`read()` 返回的是字节值（0~255）**：不是字符；读到文件末尾返回 `-1`。
105. **标准读取循环**：`while ((b = fis.read()) != -1) { ... }`，靠 `-1` 判断结束。
106. **字节流直接读中文会乱码**：UTF-8 下一个汉字占 3 字节，按字节读再 `(char)` 强转必然乱码（实测 `a.txt` 里的「这是一句神秘的代码」输出成 `è???...`）。读中文要用字符流，或先按 UTF-8 解码。

## 更新记录

### 2026-10-02

- `Poly/` 新增三个知识点练习：
  - `com.Abstracttest3`：抽象类与抽象方法（Animal / Cat）。
  - `com.Interface`：接口 `interface` 与 `implements`，抽象类 + 接口组合使用（Animal / Fork / swim）。
  - `com.InnerClass`：匿名内部类，用一次性的内部类实现接口（Swim / Test）。
- README 同步更新知识点索引与学习进度。

### 2026-10-03

- 新增 `API/` 项目：常用 API 练习。
  - `com.APITest1`：`Random` 随机数（小数、指定范围）。
  - `com.StringTest2`：String 的五种创建方式。
  - `com.StringTest3`：字符串比较 `equals` / 登录模拟、字符串遍历、字符种类统计、数组转字符串（`Arrayutil`）。
- README 同步更新知识点索引与学习进度。

### 2026-10-04

- `API/` 项目新增：
  - `com.StringTest4`：`substring` 截取、`charAt`，手机号脱敏。
  - `com.StringTest5`：`replaceAll` 敏感词替换。
  - `com.contains_`：String 查找与转换（`contains` / `startsWith` / `endsWith` / `indexOf` / `lastIndexOf` / `isEmpty` / `toCharArray` / 大小写）。
  - `com.StringBuilderDemo`：字符串拼接性能问题 + `StringBuilder` 的 `append` / `toString`。
  - `com.ArrayListDemo`：`ArrayList` 集合入门（`add` / `set` / `get` / `size` / 遍历）。
- README 同步更新知识点索引与学习进度。

### 2026-10-05

- 新增 `TestFightGame/` 阶段性项目：控制台「文字格斗游戏」的登录 / 注册模块（`APP` 启动类、`User` 实体、`Login` 界面）。
- 该项目是把已学内容（面向对象、集合、String、控制台交互）串起来的第一个综合练习；**今天没有新学知识点，项目尚未完成**。
- README 新增「踩坑经验总结（2026-10-05）」，收录今天调试中遇到的问题与结论。

### 2026-10-06

- 学习常用类：`System`、`Object`、包装类（含扩展 `BigInteger` / `BigDecimal`），整理为「学习笔记（2026-10-06）」写进本 README。
- README 同步更新学习进度（新增「常用类」一项）与更新记录。

### 2026-10-07

- 新增 `api-code/` 项目：
  - `com.zhangyihang.mathTest`：`Math` 数学工具类（`abs` / `ceil` / `floor` / `round` / `pow` / `sqrt` / `cbrt` / `random`）。
  - `com.zhangyihang.WebSpider`：`Pattern` / `Matcher` 正则入门、忽略大小写与前瞻断言、`replaceAll` / `split`，以及 `URL` 网页爬取占位练习。
- 新增 `search_code/` 项目：基本查找（从 0 索引逐个比较）。
- README 新增「踩坑经验总结（2026-10-07）」（正则与 IDEA 排错），并同步更新目录一览、知识点索引、学习进度与更新记录。

### 2026-10-08

- 学习查找算法与排序算法，`search_code/` 同步补齐两个文件：
  - `com.zhangyihang.search.BinarySearch`：二分查找（数组必须有序，`min` / `max` / `mid` 折半收缩，找不到返回 `-1`）。
  - `com.zhangyihang.search.BlockSearch`：分块查找（索引表 `block[]` 定位块 + 块内顺序查找），含索引实体类 `block`（`min` / `max` / `startIndex` / `endIndex`）。
- 新增 `Sort_Code/` 项目：`com.zhangyihang.mysort.a01_BubbleSort`（冒泡排序）。
- README 新增「踩坑经验总结（2026-10-08）」（结构 / 边界 / 概念三组共 13 条），并同步更新目录一览、知识点索引（新增「十一、排序算法」）、学习进度与更新记录。

### 2026-10-09

- 学习四个排序算法与递归，`Sort_Code/` 新增 4 个文件、整理 1 个：
  - `com.zhangyihang.mysort.a02_SelectionSort`：选择（交换）排序。
  - `com.zhangyihang.mysort.a03_InsertSort`：插入排序（修好了 `break` 位置与循环边界）。
  - `com.zhangyihang.mysort.a04_Recursion`：递归求 1~100 的和 + 阶乘（阶乘目前返回 `int`，20! 会溢出，待改 `long`）。
  - `com.zhangyihang.mysort.a05_quicklySort`：快速排序（递归出口 `i >= j` 放第一行、右指针先动、左右半递归参数修正）。
- README 新增「踩坑经验总结（2026-10-09）」（结构 / 递归 / 快排 / 数值 / static / 调试 六组，编号 36~56），并同步更新目录一览、知识点索引（补充「十一、排序算法」）、学习进度与更新记录。

### 2026-10-11

- 新增 `MyAPI/` 项目：
  - `com.zhangyihang.TestAPI.MyArraysDemo1`：`java.util.Arrays` 常用 API 练习（`toString` / `binarySearch` / `copyOf` / `copyOfRange` / `fill` / `sort`），并用「取负 → 排序 → 再取负」实现降序排序 `sort1`。
  - `com.zhangyihang.TestLambda.LambdaDemo1`：接口 + 匿名内部类实现接口、`method(Swim s)` 演示接口作参数（回调），并开始接触 Lambda 表达式。**Lambda 尚未学完。**
- README 新增「踩坑经验总结（2026-10-11）」（结构 / Arrays / 接口多态 / Lambda 四组，编号 57~68），并同步更新目录一览、知识点索引（新增「十二」）、学习进度与更新记录。

### 2026-10-14

- 新增 `Myfile/` 项目：`java.io.File` 常用 API 练习（写在默认包下）。
  - `FileDemo1`：`File` 的两种构造方式（`new File(path)` / `new File(parent, child)`）与打印。
  - `FileDemo2`：`isDirectory()` / `isFile()` / `exists()` 判断。
  - `FileDemo3`：`length()`（文件字节数，对文件夹无意义）、`getAbsolutePath()`、`getName()`、`lastModified()`（毫秒时间戳）。
  - `FileDemo4`：`createNewFile()` 创建文件（返回 `true` / `false`）与 `throws IOException`。
  - `FileDemo5`：`delete()` 删除文件。
- 顺带理清「异常的抛出 / 声明 / 捕获」：`throw`、`throws` 与 `try-catch` 的区别，以及 `createNewFile()` 为什么返回 `false` 而不是抛异常。
- README 新增「踩坑经验总结（2026-10-14）」（File / 异常 / 结构三组，编号 69~80），并同步更新目录一览、知识点索引（新增「十三」）、学习进度与更新记录。

### 2026-10-15

- `Myfile/` 继续练 `File`，新增 4 个文件：
  - `FileDemo6`：`listFiles()` 列出目录下的直接子项并遍历。
  - `com.zhangyihang.Test.Test1`：`mkdirs()` 建目录 + `createNewFile()` 建文件（顺带修正了路径多写一层的问题）。
  - `com.zhangyihang.Test.Test2`：封装方法判断某文件夹下是否存在 `.avi` 文件。
  - `com.zhangyihang.Test.Test3`：递归遍历文件夹找出所有 `.avi` 文件。
- 新增 `MyIO/` 项目：`com.zhangyihang.bytestream.ByteStreamDemo1`，字节**输出流** `FileOutputStream` 写出数据（`write(98)` → `close()`）。
- 理清「输入流 / 输出流」的方向概念（参照物是程序而不是文件）、以及 `File` 与流的职责分工。
- 把 README 的「踩坑经验总结」全量重排：1~96 条统一为「一条只讲一件事：现象 → 结论」，并把正文里 GitHub 不渲染的 `$...$` 公式改成纯文本。
- README 新增「踩坑经验总结（2026-10-15）」（路径 / 递归性能 / IO 流概念三组，编号 81~96），并同步更新目录一览、知识点索引（补充「十三」、新增「十四」）、学习进度与更新记录。

### 2026-10-16

- `MyIO/` 继续练字节流，新增 4 个文件、更新 1 个：
  - `ByteStreamDemo1`：补充说明——输出流可以接收文件名字符串或 `File` 对象；文件不存在会创建（前提是父级路径存在），已存在会**先清空**。
  - `ByteStreamDemo3`：`write(byte[])` 写整个数组、`write(byte[], off, len)` 写数组的一部分。
  - `ByteStreamDemo4`：`FileOutputStream(file, true)` **续写**模式、`getBytes(StandardCharsets.UTF_8)` 转字节、`\r\n` 写换行。
  - `ByteStreamDemo5`：字节输入流 `FileInputStream` 的 `read()`，读完返回 `-1`。
  - `ByteStreamDemo6`：`while ((b = fis.read()) != -1)` 循环读取全部内容。
- 记录字节流的两个关键点：`write(int)` 写的是字节（ASCII 码）；字节流按字节读中文会乱码（实测）。
- README 新增「踩坑经验总结（2026-10-16）」（字节输出流 / 字节输入流两组，编号 97~106），并同步更新目录一览、知识点索引（补充「十四」）、学习进度与更新记录。
