README
===========================
本内容分享用于解决http 推送activeMQ，存在http 对包，或http 推送阻塞问题，
<br> 
### 解方案：
通过netty 替代http ，解决http上面存在的问题，提高程序性能。。。
<br>
netty-producer工程测试单线程消息推送 与多线程推送dome 内容提供参考，欢迎吐槽

****
	
|Author|zyy|
|----|----
|E-mail|13687097822@126.com

>NettyMqService -- 运行工程
>>MainServer --netty 启动
>>> TcpClient -- 单线程启动
>>>> ClientMsgSender 多线程消息推送

***
以下工程分别为父工程依赖包：<br>
qs-side
<br>
sync-model
<br>
sync-sender
---
code:
```java
 //启动netty
 public class MainServer {
	public static void main(String[] args) {
		NettyMqServer server = new NettyMqServer();
		server.doStart();
	}
}
 
 ```
 具体请查看文件code