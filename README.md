# Java 学习记录

记录我学习 Java 的练习代码，按学习顺序：基础语法 → 面向对象 → 继承 → 多态 → 抽象类 / 接口 / 内部类 → 常用 API → StringBuilder → 集合入门 → 阶段性项目实战 → 常用类（System / Object / 包装类）→ Math / 正则表达式 → 查找算法 → 排序算法。

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
| `Sort_Code/` | 排序算法：冒泡排序 | 2026-10-08 |

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
- [x] 排序算法：冒泡排序
- [ ] 集合框架（进阶）
- [ ] IO 与异常

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

这是写「文字格斗游戏」时踩到的坑与结论，记下来避免再犯。

### 结构 / 括号

1. 方法只能写在类的**直接层级**：不能在方法里再定义方法（报 `illegal start of expression`），也不能写在类外面（报 `class, interface, enum, or record expected`）。
2. 花括号必须配对：多一个或提前闭合的 `}`，会让后面的方法“掉到类外面”。写完按 `Ctrl + Alt + L` 格式化，层次一眼就清楚。
3. 同一个方法里局部变量不能重名：报 `variable xxx is already defined`；哪怕一个在方法级、一个在循环块内，也不能同名。

### 方法 / 参数 / 返回值

4. 返回类型必须和 `return` 一致：`void` 方法不能 `return 值`（报 `unexpected return value`）；要返回值就把返回类型改成对应类型。
5. `return` 结束的是**整个方法**，不是循环。区分三者：`return`（结束方法）/ `break`（结束循环）/ `continue`（跳过本次）。
6. `return false` 要放在循环**外面**：放里面会报 `missing return statement`，而且循环只会检查第一个元素。规则是「循环里找到就 `return true`，循环外都找完没找到才 `return false`」。
7. 形参 vs 实参：定义时写「类型 + 名字」（形参），调用时只写对象（实参）；参数名随便取、只在方法内有效。`ArrayList<User> list = new ArrayList<>()` 里的 `list` 是**变量名**，不是实参。

### 逻辑

8. 字符比较要用字符字面量：判断数字写 `c >= '0' && c <= '9'`，别写 `c >= 0 && c <= 9`（那是拿编码值比较，永远判不出数字）。
9. 集合装的是对象：`ArrayList<User>` 里用 `list.contains("字符串")` 永远返回 false，要遍历比较 `getUsername()`。
10. 防空指针：`x.equals(u.getUsername())` 比 `u.getUsername().equals(x)` 安全（后者用户名是 null 会崩）。

### 常用 API

11. `Random` 的构造参数是**种子**（long）：同种子序列可复现，且种子与输出之间没有可直观对应的关系；`java.util.Random` 是伪随机，安全场景请用 `SecureRandom`。

### 学习方向（AI 时代）

12. 语法 / API 细节可以少背、多交给 AI；但「读代码、调试、判断对错、设计结构」必须自己练——今天的坑几乎都是结构与逻辑问题，正是 AI 也容易写错、最需要你把关的地方。

## 踩坑经验总结（2026-10-07）

学正则表达式和查找算法时踩到的坑，记下来避免再犯。

### 正则 / Matcher

13. `find()` 是**消费式**的：每调用一次才向后推进一格。正确写法是 `while (m.find()) { ... }`。
14. 死循环的根源：写了 `boolean b = m.find(); while (b) { ... }`，循环里从不更新 `b`，`b` 永远为 `true`，`group()` 也永远返回同一个匹配。
15. 反过来，进循环前**多调一次** `find()` 会「吃掉」第一个匹配：循环前写了 `boolean b = m.find();` 又用 `while (m.find())`，结果第一个 `JDK 27` 消失，只剩后面几个。
16. 想「匹配但不消耗」，用**零宽前瞻** `(?=...)`：如 `(?i)JDK(?=\s*\d+)` 只匹配 `JDK`，版本号留给前瞻去「看」。
17. 忽略大小写：正则开头加 `(?i)`，或 `Pattern.compile(re, Pattern.CASE_INSENSITIVE)`。
18. 只要带数字的版本号，把可选组去掉：`JDK\s*(\d+)?` → `JDK\s*(\d+)`。
19. `replaceAll(regex, ...)` / `split(regex)` 的形参名是 regex 时，一定按正则解析：`split("[A-Za-z0-9]+")` 会按「字母数字串」切割。

### 结构 / IDEA

20. **方法必须写在类的花括号内部**：写到类外面（`}` 之后）会报 `class, interface, enum, or record expected`。
21. 文件放在 `src\com\zhangyihang\search\` 下，代码第一行应写 `package com.zhangyihang.search;`，否则报「包名与文件路径不对应」。
22. 方法名不要和类名重名（如方法也叫 `BasicSearch1`），容易和构造器混淆，改用小驼峰。

## 踩坑经验总结（2026-10-08）

学查找 / 排序算法时踩到的坑，以及今天问到的几个概念，记下来避免再犯。

### 结构与编译

23. **大括号提前闭合**是今天最坑的错：`BlockSearch` 类在第 21 行就 `}` 结束了，`findBlock` / `getIndex` 掉到类外面。JDK 25 会把这种「顶层方法」当成**紧凑源文件**去解析，于是报错出现在**第 1 行**「压缩源文件不应有程序包声明」，跟真实原因完全对不上。**报错位置离谱时，先数括号。**
24. **类名不能当对象用**：写 `block.getMin` 报「找不到符号 / 符号: 变量 getMin / 位置: 类 BlockSearch.block」——`block` 是类名，编译器在找同名字段；就算写 `block.getMin()` 也不行，**实例方法只能由对象调用**，类名只能调静态成员。
25. **`private` 成员跨类访问不到**：`blockArr[i].min` 报「min 在 block 中是 private 访问控制」；同类里访问别人的私有方法报「secret() 在 A 中是 private 访问控制」；跨包访问包级成员报「pkg()在A中不是公共的; 无法从外部程序包中对其进行访问」。要用就通过 `getMin()`。
26. **方法必须写在类里**：Java 没有顶层方法。唯一例外是 JDK 25 的**紧凑源文件**（JEP 512）——没有 `package` 声明的单文件可以直接写顶层 `void main()` 并用 `java Demo.java` 运行；但一旦有 `package` 声明就会冲突。

### 逻辑与边界

27. **返回「找不到」用 `null`**：对象类型的惯例，方法注释写清，调用方必须判空。对外 API 可用 `Optional`，只有「不该发生」的情况才抛异常；`return block;` 这种把类名当变量写会报「找不到符号」，循环走完也必须有 `return`，否则报 `missing return statement`。
28. **循环边界 `<` 漏元素**：`for (int i = b.getStartIndex(); i < b.getEndIndex(); i++)` 把块的最后一个位置漏掉了——查 48（下标正好是 b4 的 `endIndex`）永远失败，而查 50（`endIndex - 1`）却正常。**这种「时灵时不灵」的边界 bug 最难查**：`endIndex` 是包含语义就必须写 `<=`，或者两处口径统一改。
29. **分块查找的前提是「块间有序」**：后一块的所有元素都要大于前一块的最大值；今天的数据 22~40 / 13~20 / 7~10 / 43~50 块间是乱的，严格说不满足前提，只能靠 `min` / `max` 区间匹配块，没法用「块最大值 + 二分」加速索引表。
30. **冒泡排序的边界**：外层 `n-1` 轮，内层 `n-1-i`（每轮结束末尾又多排好一个最大的元素），左 > 右就交换。边界写错不会报错，只会结果不对。

### 概念

31. **跨类调用 = 访问权限 + 调用方式**：`private` 本类 / 默认（包级）同包 / `protected` 同包 + 子类 / `public` 全部；实例方法要 `new` 对象，静态方法 `类名.方法()`，跨包要 `import`，子类可直接继承调用；静态方法里不能直接使用非静态成员。
32. **`private` 的意义不在「能不能读」，在「能不能改」**：只给 getter 不给 setter 就是只读；setter 里能加校验（public 字段被改成 `100~1` 会静默报废，私有 setter 当场拦截）；还能只暴露部分字段、换内部实现、返回防御性副本、`final` 做成不可变对象。**每个字段都无脑配 getter/setter，那才真的等于 public。**
33. **练习方法**：每种查找 / 排序都补三条边界用例——查第一个、查最后一个、查不存在的元素。今天的 48 就是死在最后一条上。

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
- README 新增「踩坑经验总结（2026-10-08）」（结构 / 边界 / 概念三组共 11 条），并同步更新目录一览、知识点索引（新增「十一、排序算法」）、学习进度与更新记录。
