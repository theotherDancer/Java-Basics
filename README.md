# Java 学习记录

记录我学习 Java 的练习代码，按学习顺序：基础语法 → 面向对象 → 继承 → 多态 → 抽象类 / 接口 / 内部类 → 常用 API → StringBuilder → 集合入门 → 阶段性项目实战 → 常用类（System / Object / 包装类）→ Math / 正则表达式 → 查找算法 → 排序算法 → `java.util.Arrays` 常用 API → 函数式编程 / Lambda → File 类常用 API → IO 流（字节流 / 字符流入门）/ 异常处理（入门）。

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
| `MyIO/` | IO 流：字节流（读 / 写 / 拷贝）、字符流（FileReader / FileWriter） | 2026-10-15 ~ 10-17（IO 进行中） |
| `Review/` | 复习：接口多态、登录注册、异常、File；字节复制、字符读写与缓冲流 | 2026-10-19 ~ 10-20 |
| `JavaCollections/` | List 增删改查、遍历与安全删除、报名综合练习、HashSet 与学生对象判重 | 2026-10-20 ~ 10-21（Map 待实操） |

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

### 十四、IO 流（字节流 / 字符流入门）`MyIO/`

新工程 `MyIO/`，开始学 `java.io` 的**流**：方向和「程序」有关——数据**进程序**叫输入流、**出程序**叫输出流。

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.bytestream | ByteStreamDemo1.java | 字节**输出流** `FileOutputStream`：构造参数可以是文件名字符串或 `File` 对象；文件不存在会创建（父目录须存在）、已存在会**先清空**；`write(int)` 写一个字节、`close()` 释放资源 |
| com.zhangyihang.bytestream | ByteStreamDemo3.java | `write(byte[])` 一次写整个数组；`write(byte[], off, len)` 写数组的一部分，第三个参数是**长度** |
| com.zhangyihang.bytestream | ByteStreamDemo4.java | `FileOutputStream(file, true)` **续写**模式；`getBytes(StandardCharsets.UTF_8)` 字符串转字节；`\r\n` 写 Windows 换行 |
| com.zhangyihang.bytestream | ByteStreamDemo5.java | 字节**输入流** `FileInputStream`：`read()` 返回一个字节值，读完返回 `-1` |
| com.zhangyihang.bytestream | ByteStreamDemo6.java | 循环读取：`while ((b = fis.read()) != -1) { ... }` |
| com.zhangyihang.bytestream | ByteStreamDemo7.java | 边读边写拷贝文件：`read()` + `write(int)`，先开的流最后关 |
| com.zhangyihang.bytestream | ByteStreamDemo8.java | 用 `byte[]` 缓冲区拷贝图片：`read(byte[])` 返回本次长度，`write(b, 0, len)` 只写有效部分 |
| com.zhangyihang.charstream | CharStreamDemo1.java | `FileReader` 无参 `read()`：逐字符读取，`(char)` 转回汉字 |
| com.zhangyihang.charstream | CharStreamDemo2.java | `read(char[])`：返回本次读到的字符数，用 `new String(chars, 0, len)` 还原 |
| com.zhangyihang.charstream | CharStreamDemo3.java | `FileWriter(file, true)` 追加写：`write(String)` / `write(char[])` |

### 十五、复习练习 `Review/`

覆盖 2026-10-19～10-20 已上传的接口多态、登录注册、异常与 IO 复习。表中文件名可直接打开源码；不把仅在本地保存、尚未上传的其他练习列为仓库入口。

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.review_2 | [Notification.java](Review/src/com/zhangyihang/review_2/Notification.java) | 通知接口：定义 send 契约，接口类型可以引用实现类对象 |
| com.zhangyihang.review_2 | [AppNotification.java](Review/src/com/zhangyihang/review_2/AppNotification.java) | implements 实现接口、重写 send，提供 APP 通知行为 |
| com.zhangyihang.review_2 | [EmailNotification.java](Review/src/com/zhangyihang/review_2/EmailNotification.java) | 相同接口、不同实现：邮件通知 |
| com.zhangyihang.review_2 | [SmsNotification.java](Review/src/com/zhangyihang/review_2/SmsNotification.java) | 相同接口、不同实现：短信通知 |
| com.zhangyihang.review_2 | [Test.java](Review/src/com/zhangyihang/review_2/Test.java) | 接口作参数、接口数组、统一调用 send、跳过 null 元素；notifyUser / notifyAll |
| com.zhangyihang.review_3 | [User.java](Review/src/com/zhangyihang/review_3/User.java) | 用户封装：private 字段、构造方法、getter |
| com.zhangyihang.review_3 | [Test.java](Review/src/com/zhangyihang/review_3/Test.java) | ArrayList 用户列表；findUser 返回对象或 null；String.equals 比较内容；登录分支、注册查重、boolean 返回值与调用方判断 |
| com.zhangyihang.review4 | [Test.java](Review/src/com/zhangyihang/review4/Test.java) | Integer.parseInt、NumberFormatException、throw 抛出 IllegalArgumentException、0～150 年龄校验、循环中逐项捕获异常 |
| com.zhangyihang.review4 | [FileTest.java](Review/src/com/zhangyihang/review4/FileTest.java) | File.createNewFile 的 true/false 与 IOException；throws 声明、调用方 catch、父目录缺失、逐个文件处理 |
| com.zhangyihang.review4 | [ByteReadTest.java](Review/src/com/zhangyihang/review4/ByteReadTest.java) | FileInputStream、byte[4]、read(buffer) 返回有效数量、-1 结束、try-with-resources；逐字节转 char 仅用于当前 ASCII 样例 |
| com.zhangyihang.review4 | [CopyTest.java](Review/src/com/zhangyihang/review4/CopyTest.java) | BufferedInputStream / BufferedOutputStream 包装文件流；read(buffer) 配合 write(buffer, 0, len)；关闭外层资源 |
| com.zhangyihang.review4 | [CharReadTest.java](Review/src/com/zhangyihang/review4/CharReadTest.java) | FileReader 指定 UTF-8、char[3] 批量读取、按实际 len 遍历，避免尾部旧数据 |
| com.zhangyihang.review4 | [CharWriteTest.java](Review/src/com/zhangyihang/review4/CharWriteTest.java) | FileWriter 指定 UTF-8；独立的 try-with-resources；先覆盖写入，再 append=true 追加 |
| com.zhangyihang.review4 | [StudyLogTest.java](Review/src/com/zhangyihang/review4/StudyLogTest.java) | BufferedWriter 追加、newLine；BufferedReader.readLine 返回字符串、null 表示结束；读写异常反馈 |

转换流、flush 语义、File/Path/Files 的区别与常用方法另见 [2026-10-20 学习记录](#学习记录2026-10-20)，其中部分只有讲解，未新增对应独立练习文件。

### 十六、集合常用操作与对象判重 `JavaCollections/`

截至 2026-10-21：以下 7 个源文件已编译验证。ListTest、ListTraversalTest、IteratorTest、SetTest、StudentSetTest 可分别运行；ListPracticeTest 提供业务方法，Student 为实体类。验证范围与未完成项见 [2026-10-21 学习记录](#学习记录2026-10-21)。

| 包 | 文件 | 知识点 |
| --- | --- | --- |
| com.zhangyihang.collections.list | [ListTest.java](JavaCollections/src/com/zhangyihang/collections/list/ListTest.java) | List 接口与 ArrayList 实现；add / set / get / size / contains / indexOf；按下标和按内容删除的返回值；查找后判断 -1 再修改 |
| com.zhangyihang.collections.list | [ListTraversalTest.java](JavaCollections/src/com/zhangyihang/collections/list/ListTraversalTest.java) | 普通 for 的下标与显示编号；增强 for 读取元素；倒序删除，避免跳过补位元素 |
| com.zhangyihang.collections.list | [IteratorTest.java](JavaCollections/src/com/zhangyihang/collections/list/IteratorTest.java) | iterator() 获取遍历对象；hasNext 返回 boolean 且不推进；next 读取并推进；remove 删除最近读取项；相邻重复项安全删除 |
| com.zhangyihang.collections.list | [ListPracticeTest.java](JavaCollections/src/com/zhangyihang/collections/list/ListPracticeTest.java) | register 用 contains 查重；updateId 查找并拒绝新学号冲突；cancel 倒序查找删除；方法返回位置与边界检查 |
| com.zhangyihang.collections.list | [SetTest.java](JavaCollections/src/com/zhangyihang/collections/list/SetTest.java) | Set 接口与 HashSet 实现；学号字符串去重；add 返回是否新增；在 if 中调用 add 已执行添加；size 与重复报名反馈 |
| com.zhangyihang.collections.set | [Student.java](JavaCollections/src/com/zhangyihang/collections/set/Student.java) | 按学号重写 equals / hashCode；同一引用、null 与类型检查；对象向下转型；String.equals 内容比较；相等对象的哈希值必须一致 |
| com.zhangyihang.collections.set | [StudentSetTest.java](JavaCollections/src/com/zhangyihang/collections/set/StudentSetTest.java) | 两次 new 的对象身份与业务相等；HashSet 按学号拒绝重复；用另一个同学号对象 contains / remove，验证动态调用对象规则 |

**已讲解、尚未新增实操源码的内容：** List<Integer> 的 remove(1) 与 remove(Integer.valueOf(1))；Collection/List/Set/Queue 与独立 Map 的关系；Map 的 put/get 及返回值。不要把知识点入口或课堂讲解当作独立掌握证明。

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
- [ ] 集合框架（进阶，进行中）
  - [x] List 常用操作、遍历与安全删除、报名方法综合验证（2026-10-21）
  - [x] HashSet 基础、Student equals/hashCode、按学号去重与查询删除（2026-10-21；提示下完成并验证）
  - [ ] Map/HashMap：已讲解基本概念与 put/get，待实操验收
  - [ ] Comparator、集合工具与队列、集合综合项目
- [x] IO 入门：`File` 类常用 API（创建 / 判断 / 删除 / 时间戳 / `listFiles()`）
- [x] IO 入门：递归遍历目录、找某类文件
- [x] IO 入门：字节输出流 `FileOutputStream`（`write(int)` / `write(byte[])` / 续写 `append`）
- [x] IO 入门：字节输入流 `FileInputStream` / 输出流拷贝文件（`read()`、`read(byte[])`）（2026-10-16 ~ 10-17）
- [x] IO 入门：字符流 `FileReader` / `FileWriter`（2026-10-17）
- [x] 缓冲流基本使用：字节缓冲流复制、BufferedReader.readLine、BufferedWriter.newLine（2026-10-20；提示下完成并运行验证）
- [ ] 转换流：已讲解 InputStreamReader / OutputStreamWriter 的用途，未单独实操验收
- [ ] Path / Files：已讲解常用操作，未实操验收
- [x] 异常处理：`throw` / `throws` / `try-catch`、受检异常（2026-10-17）

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

## IntelliJ IDEA 更新速报（2026-10-17）

- 今天（2026-10-17）JetBrains 官方**没有发布新版本**，官方博客也没有当天的新文章。
- 最新稳定版：**2026.2.3**（build 262.10968.63，2026-09-16 发布）。
- 最新抢先版：**2026.3 EAP 7**（build 263.7031.23，2026-10-15 发布）。
- 近期新闻：2026-10-15，**Java and Kotlin by IntelliJ IDEA 扩展发布 1.0**，可以在 VS Code / Cursor 里使用 IDEA 的 Java / Kotlin 代码分析与重构，需要 IntelliJ IDEA Ultimate 订阅（30 天试用）。
- 如果 IDE 里弹出更新提示：多半是 2026.2.3 稳定版或 2026.3 EAP。学习阶段建议留在稳定版，EAP 可能有未修复的 bug。

参考：[IntelliJ IDEA 官方博客](https://blog.jetbrains.com/idea/) · [2026.3 EAP 7 Release Notes](https://youtrack.jetbrains.com/articles/IDEA-A-2100662751/IntelliJ-IDEA-2026.3-EAP-7-263.7031.23-build-Release-Notes) · [LSP 扩展 1.0 公告](https://blog.jetbrains.com/idea/2026/10/intellij-idea-s-java-and-kotlin-for-cursor-and-vs-code-hits-1-0/)

## 踩坑经验总结（2026-10-17）

围绕「异常到底由谁处理」和「IO 流基础」问出来的问题。每条只讲一个点：**现象 → 结论**。

### 抛出与捕获

107. **`throw` 和 `throws` 不是一回事**：`throw new XxxException(...)` 是当场真的抛出一个异常对象；方法签名上的 `throws XxxException` 只是**声明**「我可能抛」，本身不产生任何异常。
108. **不写 `throw` 也可能抛异常**：除零抛 `ArithmeticException`、空指针抛 `NullPointerException`、数组越界抛 `ArrayIndexOutOfBoundsException`，这些都是 JVM 自动抛的，跟写没写 `throw` 无关。
109. **调用了带 `throws` 的方法就必须表态**：`new FileInputStream(path)` 的构造器声明了 `throws FileNotFoundException`，调用处要么 `try-catch`，要么自己在方法签名上继续 `throws`，否则编译报「未报告的异常」。
110. **「代码逻辑没问题」和「编译能过」是两件事**：编译器检查的是「可能抛的受检异常有没有被处理」，不是「这次运行会不会真的出错」；文件在不在，是运行时才知道的事。
111. **构造器不能靠重写去掉 `throws`**：构造器不参与继承和多态，`new FileInputStream()` 永远调 JDK 那个；`throws` 是 API 契约的一部分，改不了。
112. **重写普通方法可以「少抛 / 窄抛」**：父类 `throws IOException`，子类重写可以不抛或只抛 `FileNotFoundException`；反过来抛更宽的受检异常编译不过。
113. **去掉声明不等于消除异常**：把受检异常包成 `UncheckedIOException` 抛出去，只是把「编译期强制处理」换成「运行时可能崩」，风险从编译器转给了自己。
114. **`catch` 从上到下按类型匹配**：子类写在父类前面；`FileNotFoundException` 是 `IOException` 的子类，`catch (IOException e)` 能一起接住。
115. **`try-with-resources` 是关流的标准写法**：`try (var in = new FileInputStream(path)) { ... }` 会自动 `close()`，比手写 `finally` 稳。
116. **捕获后什么都不做，等于隐藏 bug**：空 `catch` 让程序带病运行，错误会在更远的地方以更奇怪的方式爆出来。

### IO 流

117. **四个基类先记住**：`InputStream` / `OutputStream` 按字节，`Reader` / `Writer` 按字符；输入输出以「程序」为参照物。
118. **`read()` 和 `read(byte[])` 返回值含义不同**：无参 `read()` 返回字节值（0~255，结束是 `-1`）；`read(byte[])` 返回本次读到的**长度**，结束同样是 `-1`。
119. **拷贝文件必须 `read(byte[])` 配 `write(b, 0, len)`**：`len` 是本次实际读到的字节数，不是数组长度；写成 `read()` 却 `write(b, 0, len)`，写进去的是缓冲区里的脏数据（Demo8 一开始的坑）。
120. **字节流直接读中文必乱码**：UTF-8 下一个汉字占 3 字节，按字节读再 `(char)` 强转，只能得到碎掉的一半。
121. **字符流一次读一个字符**：`FileReader.read()` 返回 `int`，`(char)` 转回来就是完整汉字；`read(char[])` 返回本次读到的字符数。
122. **`FileReader` 用平台默认编码**：Windows 中文环境一般是 GBK；文件是 UTF-8 时要用 `new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8)` 指定编码。
123. **`FileWriter(file, true)` 才是追加**：不传第二个参数就是覆盖，规则和 `FileOutputStream` 一样。
124. **关流顺序：先开的后关**：Demo7 里先开 `fis` 后开 `fos`，所以先 `fos.close()` 再 `fis.close()`；用 try-with-resources 就不用记顺序。

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

### 2026-10-17

- `MyIO/` 继续练 IO：
  - `ByteStreamDemo6`：补上 `close()`。
  - `ByteStreamDemo7`：`FileInputStream` + `FileOutputStream` 边读边写拷贝文件，并统计耗时。
  - `ByteStreamDemo8`：用 `byte[]` 缓冲区拷贝图片（修正 `read()` / `read(byte[])` 混用导致写出脏数据的问题）。
  - `CharStreamDemo1`：`FileReader` 无参 `read()` 逐字符读取，中文不再乱码。
  - `CharStreamDemo2`：`read(char[])` 批量读取，按本次读到的长度构造字符串。
  - `CharStreamDemo3`：`FileWriter(file, true)` 追加写字符串与字符数组。
- 理清异常处理：`throw` / `throws` / `try-catch` 的分工、受检异常为什么绕不过编译器、构造器为什么不能重写去掉声明。
- README 新增「踩坑经验总结（2026-10-17）」（异常 / IO 两组，编号 107~124）与「IntelliJ IDEA 更新速报（2026-10-17）」，并同步更新目录一览、知识点索引、学习进度与更新记录。


## 复习记录（2026-10-18）

本次为 Java 基础至 IO 入门的集中复习，以下区分独立编码成果与讲解、问答中复习的内容，不代表所有知识均已熟练掌握。

### 独立编码与运行

- 正数计数：遍历 `int[]`，统计大于 0 的元素，循环结束后返回数量；不修改原数组，空数组返回 0。已提交方法并反馈运行成功。
- 下标查找：`findIndex(int[] arr, int target)` 找到后返回第一次出现的下标，遍历结束仍未找到返回 -1。已反馈查找不存在元素的测试运行成功；重复元素、空数组等测试仍需补充确认。
- 封装与年龄校验：使用私有字段、构造方法、getter/setter；非法年龄不修改原字段。最初只检查了下限，复习中补充了 0～150 的完整条件与边界测试思路。
- 静态计数：`Student2` 使用实例字段 name、静态字段 count、静态方法 getCount；有参构造创建两个对象后计数为 2。新增的无参构造最初未计数，已讲解通过 `this("未命名")` 复用有参构造；修改后的运行结果尚未确认。

### 核心知识梳理

1. **方法、数组与引用**：Java 按值传递参数；数组和对象作为实参时复制引用的值。通过引用修改同一对象的状态，各引用都能观察到；给某个变量重新赋值，不会改变另一个变量的指向。
2. **返回值与有效数据**：返回值含义由方法约定，可能是数量、下标或特殊标记。数组容量不等于本次有效数据长度。
3. **循环控制**：continue 跳过本轮剩余代码；break 在练习中的用法是退出当前循环；return 结束当前方法。它们不会撤销此前已经发生的输出。
4. **封装与 this**：this.name 表示当前对象的字段；this(...) 调用本类其他构造方法，不额外创建对象。范围校验要覆盖上下限，测试要包括边界内外。
5. **实例成员与 static**：实例字段由每个对象分别保存；静态字段属于类。引用赋值不会调用构造方法，也不会增加创建计数。
6. **继承与构造调用**：super(...) 调用父类构造方法，初始化当前对象的父类部分；this(...) 调用其他构造后，会返回并继续执行剩余语句。已分析无参 Student → 有参 Student → Person 的调用过程，仍需动手巩固。
7. **异常回顾**：捕获并正常处理异常后可以继续执行后续代码；throw 实际抛出异常，throws 声明可能向外抛出的异常，本身不会触发 catch。
8. **字符流回顾**：read() 返回读取的字符对应的整数或末尾标记 -1；read(char[]) 把字符放入数组，返回实际读到的字符数，末尾返回 -1。非空缓冲区不能用返回 0 判断末尾；未覆盖的数组位置可能保留旧数据。
9. **批量读取**：使用 `while ((count = reader.read(buffer)) != -1)`，再按 `new String(buffer, 0, count)` 使用有效部分；判断和处理时重复调用 read 会漏读。

### 当前进度与后续安排

- 已完成数组与方法、循环控制的核心练习；已复习对象引用、封装、static，正在巩固构造方法与继承。
- 易错点：遗漏先前输出、混淆引用重新赋值与对象修改、遗漏范围上限、混淆读取数量与末尾标记。
- 后续：构造调用小练习 → 继承/重写/多态/抽象类与接口 → String/ArrayList 基础与登录验证 → 异常、File、字节流和字符流综合验收。
- 本次 README 总结基于交流中实际提交的代码和回答；本地 IDEA 复习项目尚未提供给当前环境，尚未上传，不能以本记录代替源码同步。

## 复习记录（2026-10-19）

今天围绕面向对象、多态、String/ArrayList、登录注册、异常和字节输入流复习。代码由学习者在讲解和提示下编写、修改；运行通过不代表已能完全独立实现。

### 源码与验证

本次同步今天的 10 个 Java 源文件至 `Review/src/com/zhangyihang/`，保留本地原始代码。未上传 IDEA 配置、编译产物或昨天的 `review_1`；10 月 18 日记录中有关旧复习源码未同步的说明仍适用。

| 包 | 内容 | 验证结果 |
| --- | --- | --- |
| `review_2` | Notification 接口，App/Email/Sms 三个实现类，单条与批量通知 | 同一方法接收不同实现类；数组中 null 元素被跳过；输出三种通知。空数组此前已单独验证 |
| `review_3` | User、findUser、login、register | 内容相同的不同 String 对象可匹配；不存在用户返回 null；登录成功/密码错误/用户不存在分支均运行；正常注册增加人数，重复注册不增加、不覆盖原密码；boolean 返回值控制后续登录 |
| `review4.Test` | parseInt、try-catch、主动 throw、年龄校验 | 转换失败处理后继续执行；20、-1、150、151 四种年龄输入均得到预期结果 |
| `review4.FileTest` | File、createNewFile、throws IOException | 新建返回 true，文件已存在返回 false，缺失父目录时捕获 IOException；循环结束提示正常输出 |
| `review4.ByteReadTest` | try-with-resources、read(byte[])、有效长度 len | 使用 4 字节缓冲区读取 ABC123，完整输出，没有输出缓冲区残留内容；文件缺失场景此前也已运行验证 |

上传前使用 JDK 25 编译全部 10 个源文件，并在独立测试目录运行上述五个入口，均正常退出。登录代码当前将密码不匹配提示为“登录错误”，实际分支正确；本项目仅为明文密码、内存集合的学习练习，尚无持久化和真实网站登录状态管理。

### 今天理清的概念与踩坑

1. **接口与对象**：接口不是类，但也是引用类型，可声明变量、参数和数组。真正创建的是实现类对象。`new Notification[3]` 创建数组，三个元素初始为 null，不会创建通知对象。
2. **数组与集合**：数组用 `arr[i]`，ArrayList 用 `users.get(i)`；访问长度分别用 `length` 和 `size()`。
3. **== 与 equals**：基本类型的 == 比较值，两个引用的 == 比较是否指向同一对象；String 的 equals 比较内容。字符串字面量可能复用常量池对象，不能据此用 == 判断用户名。未显式写 new 也可能创建对象。
4. **判空与返回值**：findUser 返回 null 表示没有找到；先判断再调用 getter。register 返回 true 表示添加成功，false 表示拒绝添加。`if (success)` 直接判断 boolean，不必再写 == true。
5. **方法职责**：查找方法找到后直接返回集合中的对象；调用方保存、复用返回值。曾在 findUser 中用相同参数再次调用自身，造成无限递归和 StackOverflowError，已修复。
6. **注册条件**：曾将“没有找到用户”的分支误写为拒绝注册；现已改为不存在则添加、已存在则拒绝。
7. **异常路径**：try 内发生异常后的剩余语句会被跳过。catch 正常处理结束后可以继续；catch 中再次 throw 会向外传播，同一个 catch 不会接住自己内部抛出的异常。单线程程序中，异常最终未捕获会终止主线程。
8. **throw / throws / catch**：throw 实际抛出异常；throws 声明异常可能向外传递，本身不触发异常；catch 捕获处理。IOException 属于受检异常，需捕获或声明；IllegalArgumentException 属于运行时异常，不强制声明。
9. **File 与磁盘操作**：new File 只表示路径，不创建磁盘文件；createNewFile 不创建缺失父目录；mkdirs 用来创建目录。返回 false 与抛出异常是两种不同结果。
10. **IO 返回值与有效范围**：read() 返回字节值或 -1；read(buffer) 把数据写入数组，返回本次读取数量或 -1。处理范围为 0 到 len-1，不能按容量处理尾部旧数据；条件中已读取一次，循环体不能再重复 read。
11. **自动关闭资源**：将流声明在 try 后的圆括号中，正常结束或读取异常时均会尝试关闭已成功创建的资源。ByteReadTest 已采用此写法；main 仍保留可清理的多余 FileNotFoundException 声明与导入，不影响运行。
12. **打印数组**：byte[] 的 toString 不显示文件内容；当前练习对英文数字逐字节转 char 打印，这不适用于一般 UTF-8 中文解码。
13. **代码结构**：曾因多余右大括号使方法或 catch 脱离所属结构，已修复；继续注意缩进与括号配对。

### 进度与下一步

- 已完成以上提示下的编码练习和验证；参数、返回值、分支含义及异常传播仍需持续巩固。
- 增强 for 仅作概念讲解，当前练习继续使用普通 for；未计为独立掌握。
- 下一步是 `CopyTest` 字节流复制：read(buffer) 配合 write(buffer, 0, len)，并避免源路径与目标路径相同。截至本次同步未发现该源码，不能计为完成。
- 然后复习字符流读取/写入、编码与追加写入，完成小型 IO 综合验收；今天尚未完成该部分。
- 后续沿已提供的 AI 全栈课程目录学习；本轮只复习此前已学内容，不以完成目录比例替代实际掌握程度。

### 运行说明

`Review/` 仅包含今天的源码与 ASCII 测试文件 `review-test.txt`。使用 JDK 25，在此目录编译并运行（PowerShell）：

```powershell
$sourceFiles = Get-ChildItem -Path ./src -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $sourceFiles
java -cp out com.zhangyihang.review_2.Test
java -cp out com.zhangyihang.review_3.Test
java -cp out com.zhangyihang.review4.Test
java -cp out com.zhangyihang.review4.FileTest
java -cp out com.zhangyihang.review4.ByteReadTest
```

相对路径以运行时工作目录为准。ByteReadTest 的单字节读取版本、Notification 的普通父类和抽象类版本曾在复习中运行，当前同步的是各文件最终版本，不包含所有中间版本。

## 学习记录（2026-10-20）

今天完成已学 IO 核心内容的复习收尾，补充缓冲流基础，并开始系统学习集合。以下区分实际源码、运行验证、概念讲解和未完成练习，不以运行通过代表全部独立掌握。

### 今天同步的源码

| 文件 | 内容与状态 |
| --- | --- |
| [CopyTest](Review/src/com/zhangyihang/review4/CopyTest.java) | 先复习普通字节流复制，再改为 BufferedInputStream / BufferedOutputStream；当前上传最终的缓冲流版本 |
| [CharReadTest](Review/src/com/zhangyihang/review4/CharReadTest.java) | FileReader 指定 UTF-8，char[3] 按实际 len 遍历。课堂中曾选择跳过单独验收；本次同步发现已有完整实现，现已补做编译运行验证，输出“你好Java!” |
| [CharWriteTest](Review/src/com/zhangyihang/review4/CharWriteTest.java) | 两个顺序执行的 try-with-resources，先覆盖第一条、再追加第二条；再次运行仍为两条 |
| [StudyLogTest](Review/src/com/zhangyihang/review4/StudyLogTest.java) | BufferedWriter + UTF-8 追加并 newLine；BufferedReader 按行读取，以 null 判断结束；读写失败打印原因 |
| [ListTest](JavaCollections/src/com/zhangyihang/collections/list/ListTest.java) | List<String> 声明、ArrayList 对象，add 插入、set 替换均已验证；最新源码还完成了 remove(1) 接收并打印“小李”，删除练习仅完成第一步 |

源码保留 IDEA 中的实际写法，不为总结而代写、重构。未上传 IDE 缓存、out、class、重复生成的日志等。Review 增加 UTF-8 示例输入 review-text.txt；JavaCollections 增加编译输出与个人 IDE 状态的忽略规则。

### 已运行验证

上传前使用 JDK 25 编译今天的 5 个源文件，并在独立测试目录执行五个入口：

- CopyTest：当前缓冲流版复制 ABC123，源与目标 SHA-256 一致。今天早些时候，普通字节流版还验证过空文件和尾部不足缓冲容量的样例。
- CharReadTest：读取“你好Java!”，准确输出，尾部不足 3 个字符时不重复旧数据。
- CharWriteTest：两次运行后的内容相同，均为“第一条记录”和“第二条记录”两行。
- StudyLogTest：首次运行 2 条，再运行 4 条，中文与追加正确。课堂中按行版本也已验证中间空行不会提前结束。
- ListTest：依次输出 [小林, 小王, 小周]、3、[小林, 小李, 小周]、3、小李。按下标删除返回值已验证；删除后名单、按内容删除不存在元素及其返回 false 的测试尚未完成。

### 今天理解与修正的问题

1. **有效数量与数组容量**：字符读取曾按 chars.length 遍历，用 ABCD 测试时输出 ABCDBC；改为 i < len 后修复。实际 len 才决定本次哪些位置有效。
2. **字符与编码**：常用汉字“你”在 UTF-8 文件中占 3 字节，解码后可由一个 Java char 表示；char 是 16 位 UTF-16 编码单元，并非所有汉字或 emoji 都只占一个 char。FileReader 负责解码，不是把 3 个原始字节直接塞进 char。
3. **覆盖、追加与换行**：FileWriter 默认覆盖，append=true 保留旧内容；write 不自动换行，BufferedWriter.newLine 写当前系统换行符。
4. **flush 与 close**：flush 推送当前缓冲数据但不关闭流；正常 close 会刷新并关闭。try-with-resources 管理关闭，不必每写一条都 flush；flush 不等于保证已持久写入物理磁盘。
5. **缓冲不等于解码**：缓冲流管理内部缓冲区；外部 byte[] 仍可用于批量处理。增加字节缓冲层不会自动解决中文解码；已批量读取时，额外缓冲不保证必然更快。
6. **包装关系**：BufferedInputStream 包装 FileInputStream；BufferedOutputStream 包装 FileOutputStream。曾把 FileOutputStream 误写为 FilterOutputStream，后者不能直接接收文件路径字符串，现已修复。关闭外层会关闭其包装的底层流。
7. **按行读取**：readLine 返回 String，不含行尾换行符，结束为 null；空行返回空字符串。它不接收 char[] 参数；read(char[]) 仍是按数量读取，不按行划分。可用 String[] 或 ArrayList<String> 保存行，但立即打印不必保存全部内容。
8. **异常处理**：StudyLogTest 读取失败曾重新抛出 RuntimeException，已改为打印 IOException 的原因；写入提示也已补充具体原因。当前 showRecords 仍有未使用的 char[] 和旧注释，属于可清理项，不影响功能。
9. **File、Path 与 Files**：File 表示路径并提供部分操作；Path 表示路径；Files 提供静态工具方法。Files.copy 封装复制，默认目标存在时报错，REPLACE_EXISTING 表示允许替换。readString / writeString 适用于小文本，readString 会整体读入内存；缺失父目录仍需单独创建。本部分只有讲解，仓库没有新增 FilesTest。
10. **集合整体认识**：Collection 下认识 List、Set、Queue；Map 是独立的键值对体系。交互示例观察到 List 保留重复、Set 去重、Map 同键更新值且数量不增加。“小林（新）”是演示提供的新值，不是 Map 自动生成的标记。
11. **List 基础**：List 是接口，ArrayList 是实现类；<String> 限定元素类型。add(1, 元素) 插入并移动后续元素、人数增加；set(1, 元素) 替换、人数不变。操作按代码顺序作用于同一份名单。

### 下一步与教学安排

- 本轮已学 IO 核心复习基本收尾；转换流、Path/Files 记为概念了解，今后遇到实际场景再巩固，不算独立掌握。
- 集合主线：泛型与 List/ArrayList → 遍历与安全删除 → Set/HashSet 及 equals/hashCode → Map/HashMap → Comparator 排序 → 社团报名综合练习。
- 下次从 List.remove 继续，补完返回值、删除后列表和按内容删除的测试，再学习遍历时删除。Set/Map 目前仅整体认识，并未开始独立编码。
- 用户希望优先学重要且实用的内容；先给全局地图和路线，再用可交互演示、短讲解、小段编码和真实排错推进，减少重复练习和连续长文字。

### 运行提示

沿用 JDK 25。Review 目录中编译 src 后运行 review4 下各入口；相对文件路径以工作目录为准。review-text.txt 为“你好Java!”样例，review-test.txt 为已存在的 ABC123 样例；输出文件由练习生成。

JavaCollections 可在该目录中执行：

```powershell
$sourceFiles = Get-ChildItem -Path ./src -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $sourceFiles
java -cp out com.zhangyihang.collections.list.ListTest
```

## 学习记录（2026-10-21）

今天完成 List 常用操作与报名综合练习，并提前学习遍历、安全删除、HashSet 和自定义学生对象判重。以下记录实际代码和验证结果，不把提示下完成、概念讲解与独立掌握混为一谈。

### 今天同步的代码

| 文件 | 内容 |
| --- | --- |
| [ListTest](JavaCollections/src/com/zhangyihang/collections/list/ListTest.java) | 添加、插入、替换、两种删除、查询、查找后修改；拆成四个独立演示方法 |
| [ListTraversalTest](JavaCollections/src/com/zhangyihang/collections/list/ListTraversalTest.java) | 普通 for 打印编号、增强 for 打印通知、倒序删除相邻重复元素 |
| [IteratorTest](JavaCollections/src/com/zhangyihang/collections/list/IteratorTest.java) | 获取迭代器，使用 hasNext / next / remove 遍历并删除小林 |
| [ListPracticeTest](JavaCollections/src/com/zhangyihang/collections/list/ListPracticeTest.java) | 学号报名 register、修改 updateId、取消 cancel；拒绝重复报名及修改后的学号冲突 |
| [SetTest](JavaCollections/src/com/zhangyihang/collections/list/SetTest.java) | HashSet 保存学号，直接使用 add 的返回值反馈报名是否成功；第二次报名同一学号失败 |
| [Student](JavaCollections/src/com/zhangyihang/collections/set/Student.java) | 学号与姓名字段、构造方法；重写 equals / hashCode，按学号判定学生相等 |
| [StudentSetTest](JavaCollections/src/com/zhangyihang/collections/set/StudentSetTest.java) | 两个同学号对象加入 Set 的对比实验；使用另一个同学号对象查询和删除 |

List 基础、for 遍历和迭代器已分文件整理，每段演示使用自己的名单，避免前一段删除影响后一段。ListPracticeTest 保留自己编写的倒序循环 cancel，并仅整理格式；直接 return studentIds.remove(studentId) 的简化版本已讲解，但未替换源码。SetTest 目前仍位于 list 包，按 IDEA 的实际结构同步。

### 一、List：位置、重复与方法返回值

- List 是接口，ArrayList 是现成实现类。创建 ArrayList 后，添加、查询、移动元素、扩容等能力由集合负责，不需要自己实现。
- ArrayList 允许重复且保留列表顺序；[小林, 小周, 小林] 是合法名单。内部存放对象引用，同一个对象引用也可以出现在多个位置。
- add(index, value) 插入，后面的元素补位移动，数量增加；set(index, value) 替换，数量不变。set 方法与 Set 接口是不同概念。
- get(index) 获取元素，越界会抛异常；indexOf(value) 返回首次出现的下标，找不到返回 -1；contains 返回 boolean，只查询不修改；size 返回元素个数。
- remove(int index) 返回被删除的元素；remove(Object value) 删除首个匹配元素并返回 boolean。连续删除唯一的“小周”，结果是 true、false。
- List<Integer> 的 remove(1) 按下标删除；要删除数字 1，可写 remove(Integer.valueOf(1))。从 [10, 20, 1] 依次执行这两种删除，返回值分别为 20、true，最终为 [10]。本项进行了讲解和纠正，未新增单独的整数练习源文件。

### 二、遍历与安全删除

| 方式 | 适用场景 | 注意点 |
| --- | --- | --- |
| 普通 for | 需要下标、显示编号 | 显示编号可用 i + 1，访问元素仍用 i |
| 增强 for | 依次读取元素 | 不要直接在这种遍历中增删当前 ArrayList |
| 倒序下标循环 | ArrayList 按条件删除 | 从 size() - 1 到 0，避免正序删除后 i++ 跳过补位元素 |
| Iterator | 逐个访问，需要时删除 | 删除使用 iterator.remove()，与迭代器配套维护遍历状态 |

```java
Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    String name = iterator.next();
    if ("小林".equals(name)) {
        iterator.remove();
    }
}
```

- hasNext() 返回 boolean，只检查，不推进；连续调用不会跳过第一个元素。
- next() 返回下一元素（本例 String），并推进；读取不会删除。没有下一项还调用会抛 NoSuchElementException。
- remove() 返回 void，删除最近一次 next 返回的元素。对当前 ArrayList 迭代器，必须先 next；一次 next 后最多 remove 一次，否则抛 IllegalStateException。
- names.iterator() 返回一个迭代器对象，没有复制名单，也没有读取首个元素。Iterator 接口类型变量接收具体实现对象，调用其方法时体现多态。
- 遍历期间直接调用 names.remove 可能触发 ConcurrentModificationException，单线程也可能发生；没有抛异常不能作为正确性的证明。

### 三、Set：集合负责查重，对象定义相等规则

Set 是不保留重复元素的接口，HashSet 是已经封装好的实现。HashSet 不保证遍历顺序，没有 get(下标)。它内部使用 HashMap，添加时利用哈希值缩小范围，再判断候选是否相等；不是先添加重复项再清理。

字符串已经由 String 定义了内容相等规则，所以相同学号字符串第二次 add 返回 false。自定义 Student 则需要定义业务上的“同一个学生”：本次选择学号，不比较姓名。

```java
// 当前规则的核心，沿用学号非 null 的约定
return this.studentId.equals(other.studentId); // equals 的最终比较
return this.studentId.hashCode();             // hashCode 的返回值
```

上面是两个不同方法中的核心语句，不是同一方法里连续写两个 return。当前 Student 源码保留了等价的 if/return true/return false 写法，尚未简化为第一行。

- a == b 判断是否为同一个对象；a.equals(b) 执行 Student 的相等规则。两次 new 创建两个对象，但同学号可 equals 为 true。
- equals 相等的对象，hashCode 必须相同；hashCode 相同的对象不一定相等，碰撞不表示重复。hashCode 不是唯一身份证号，也不等于必须返回内存地址。
- HashSet 的 contains/remove 已经封装好，不需要重写；需要判断对象相等时，会使用对象实际类型的 equals。重写 Student.equals，就能让这些操作使用学号规则。
- 自定义对象未重写 equals 时，继承 Object 的默认身份比较规则。String 则已有自己的内容比较实现。
- 学生存入 HashSet 后，不要直接修改参与 equals/hashCode 的学号；如需修改，应先移除、修改，再按新状态加入，并处理新学号冲突。仅改姓名不影响当前判重规则。
- ArrayList 本身允许重复，但 ListPracticeTest.register 可以先 contains 再 add，靠业务代码拒绝重复；绕过 register 直接 add，仍可能加入重复学号。

### 四、今天排错得到的经验

1. **先执行方法，再判断返回值**：if (studentIds.add(id)) 已经尝试添加一次，分支只反馈结果，不应为同一次报名再 add。remove 也一样；contains 则没有增删副作用。
2. **返回位置决定是否继续查找**：循环内部 return false 会在首个不匹配时提前结束；只有全找完还没找到，才在循环外返回 false。
3. **更新不能破坏唯一性**：找到旧学号后，用 indexOf(newId) 检查新学号；存在且位置不是当前 i，就拒绝修改。改成自己的原学号允许。
4. **方法属于哪个类很重要**：曾把 equals 写到 StudentSetTest，导致 this 不是 Student，字段无法按预期访问。判重规则应放 Student，测试类只调用和观察。
5. **类型转换不创建对象**：Object obj = student 再 (Student) obj，仍指向原对象。类型检查后再向下转型；不能把字符串强行变成学生。
6. **同名方法看接收对象**：Student.equals 内部的 studentId.equals(...) 调用的是 String.equals，不是递归调用 Student.equals；this.equals(other) 才可能再次进入自身实现。
7. **this 的使用**：没有同名形参或局部变量时，studentId 与 this.studentId 指当前对象同一字段；构造方法有同名形参时，用 this.studentId 区分字段。
8. **善用现成返回值**：学号为 String 时，cancel 可以直接 return studentIds.remove(studentId)。现成方法恰好符合业务，就不必重新写查找循环；循环版本也适合练习执行过程。
9. **排版帮助识别逻辑层级**：每层缩进 4 个空格，方法之间适度留空行，右括号单独一行；return false 不与循环右括号挤在一行。自动格式化不能代替逻辑检查。

### 五、本次上传前的验证

使用本机 JDK 25，编译 JavaCollections 当前全部 7 个源文件，运行 5 个 main 入口，均通过。ListPracticeTest 只有业务方法，没有 main，由独立临时测试调用。

| 验证对象 | 结果 |
| --- | --- |
| ListTest | 插入/替换、两种删除、查询、小周签到、小王不存在分支均符合预期 |
| ListTraversalTest / IteratorTest | 两个相邻“小林”都删掉，最终为 [小周, 小王] |
| SetTest | 三次报名反馈为成功、重复、成功，最终 2 个学号；不要求打印顺序 |
| StudentSetTest | 依次输出 false、true、false、1、true、true、0 |
| 报名方法的 9 项检查 | 新增、重复拒绝、非首位修改、旧号不存在、取消、再次取消、空名单、自身原号、冲突拒绝均通过 |
| Student 的 7 项检查 | 自身相等、同号不同名、相等哈希一致、不同号同名、null/不同类型、Set 去重、同号对象查询删除均通过 |
| 迭代器的 4 组样例 | 相邻匹配、空集合、全部匹配、完全不匹配均通过 |

临时验证代码不作为新的 IDEA 作业上传；编译结果、IDE 缓存与本地教学档案也不上传。Student 当前约定 studentId 非 null，未做完整的构造参数校验；其内部已判断 equals 的入参为 null，这是两件不同的事。源文件仍有旧实验注释、未用到的 other 变量等可清理项，不影响本次验证结论；README 中记录的是最终实际结果。

### 六、仅讲解和后续安排

- 已讲解集合框架整体位置：Collection 下有 List、Set、Queue；Map 独立于 Collection；Iterator 是遍历工具。ArrayList/HashSet 是现成工具，不只是抽象分类。
- Map 已认识键值对、put/get、重复键更新及基本返回值，目前没有新增 Map 实验源码，尚未完成独立实操验收。
- 下一次从 Map/HashMap 正式开始，再补 Comparator、集合选择与综合应用。今天完成的是 List 原定任务，并提前推进了 Set，集合框架整体尚未学完。
- 继续用短讲解、图解、预测、自己编码与运行验证推进；能跟随解释不直接记为长期掌握，后续用间隔回顾巩固。

### 运行方式

在 JavaCollections 目录中，使用 JDK 25 编译并选择要复习的入口运行：

```powershell
$sourceFiles = Get-ChildItem -Path ./src -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $sourceFiles
java -cp out com.zhangyihang.collections.list.ListTest
java -cp out com.zhangyihang.collections.list.ListTraversalTest
java -cp out com.zhangyihang.collections.list.IteratorTest
java -cp out com.zhangyihang.collections.list.SetTest
java -cp out com.zhangyihang.collections.set.StudentSetTest
```

SetTest 当前 main 未写 public，沿用本项目 JDK 25 的入口支持；按当前环境保留实际练习写法。
