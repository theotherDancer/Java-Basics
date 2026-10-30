# 网络编程入门

学习与归档日期：2026-10-30。来自本机 IDEA 工程 `network programming`，此处目录名为 NetworkProgramming，包名和源码保持原样。

## 运行

1. 使用 JDK 25，在 IDEA 打开本目录，确认 src 是源代码目录。各类 main 的包级可见性写法需要匹配的 Java 版本。
2. 在同一电脑测试时，先确认发送代码里的目标地址属于接收电脑。源码保留当时 Wi-Fi 地址 10.41.204.187；该地址不可跨环境照搬。同机测试也可自行改为 127.0.0.1。
3. 单次例子先运行 com.zhangyihang.udpReceiveDemo2，再运行 com.zhangyihang.udpSendDemo1。
4. 循环例子先运行 com.zhangyihang.Test1.udpReceiveTest，再运行 com.zhangyihang.Test1.udpSendTest，按提示输入文字。
5. 不要同时启动两个接收类，它们都监听 UDP 10086。输入 886 仅退出循环发送端，接收端需在 IDEA 停止。
6. 两台电脑之间测试需要网络可达、目标地址正确，并允许对应 UDP 通信；编译成功不等于跨机通信成功。

## 当前源码的学习痕迹

- Socket 构造说明中“这里的端口是目标端口”为旧注释；Socket 参数指定自己，Packet 参数指定对方。
- 接收端已经按 getLength 解码，不再读取整个数组容量；显式 UTF-8 的建议尚未写入源码。
- 循环接收尚无退出条件及自动关闭；Scanner 仍在发送循环内创建。按原样归档，不借提交重构。
- 当前是单向 UDP 练习，不是完整双向聊天室；getAllByName 仅讲解，未写进源码。

编译验证：归档前 JDK 25 编译全部 5 个文件通过。本次未启动网络收发程序；详细概念与原有运行反馈见 [根目录当日记录](../README.md#day-2026-10-30)。
