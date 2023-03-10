## 说明

本文对应博客：https://www.peterjxl.com/JavaSE/classpath/

建议看完博客后，自己练习一遍，有问题再来看这里的代码



## 目录说明

example1是复习编译一个类和全局classpath的

example2是复习命令行里指定classpath

example3是复习多个classpath的情况

example4 是复习编译多个类的情况，以及指定class文件输出的路径

## 练习

对于example1：

1. 在该文件夹下打开命令行，并且编译和运行Hello； 
2. 进入到本文档所在的目录，通过设置全局classpath来编译和运行Hello。

对于example2：打开命令行进入到本文档所在的目录，通过命令行里指定classpath来编译和运行Hello

对于example3：通过指定多个classpath来编译和运行Hello

对于example4：用命令行编译多个类，并用-d指定class文件输出路径

如果你能独立完成上述练习（不用倒回去看博客），那么说明你对classpath的知识点已经掌握了。下面会给出答案，仅供参考







## 答案

（请读者自行更换路径）

对于example1

1.在该文件夹下打开命令行，并且编译和运行Hello； 

```
D:\> cd D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath\example
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath\example> javac Hello.java
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath\example> java Hello
Welcome to Java!
```

2.进入到本文件所在的目录，通过设置全局classpath来编译和运行Hello。这里省略设置classpath的步骤，如有疑问请看博客

```
D:\> cd D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> javac Hello.java
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> java Hello
Welcome to Java!
```



对于example2：命令行里指定classpath

打开命令行进入到本文档所在的目录，通过命令行里指定classpath来编译和运行Hello

```
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> javac -cp ./example2 ./example2/Hello.java
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> java -cp ./example2 Hello
Peter
```



对于example3：多个classpath

```
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> javac -cp "./example3;./example3/lib" ./example3/Hello.java
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> java -cp "./example3;./example3/lib" Hello
Peter
```





对于example4

```
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> mkdir ./example4/bin
D:\Projects\LearnJava\01.JavaSE\05.OOP\05.classpath> javac -d ./example4/bin ./example4/*.java
```







