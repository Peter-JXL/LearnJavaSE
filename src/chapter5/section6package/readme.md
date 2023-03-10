## 说明

本文对应博客：https://www.peterjxl.com/JavaSE/package/

建议看完博客后，自己练习一遍，有问题再来看这里的代码



## 目录说明与练习方法

* example1：使用包来组织类。定义一个Person类属于emilia包，然后定义一个Hello包引入Person类并运行Person类的方法
* example2：包作用域，定义一个Person类，里面定义两个方法，一个用默认修饰符，一个用private修饰符，定义Hello类分别引用两个方法尝试运行。
* example3：使用`import *` 导入Peron类 和使用 `import static`导入System
* example4 ：不使用import语句，使用全类名的方式，使用java.util.Date类的方法
* example5：使用String和Object定义对象
* example6：使用javc -d指定编译后的文件存放位置，观察class文件是否会按包的层次结果来存放

如果你能独立完成上述练习（不用倒回去看博客、能独立敲出来代码并实际运行起来），那么说明你对本小节的知识点已经掌握了。下面会给出答案，仅供参考







## 答案

（请读者自行更换路径）

对于example1







对于example2：

```
D:\Projects\LearnJava\01.JavaSE\05.OOP\06.package\example2> javac ./scopeTest/Main.java

D:\Projects\LearnJava\01.JavaSE\05.OOP\06.package\example2> java scopeTest.Main
This is Person's hello method!
```





对于example3：

```
D:\Projects\LearnJava\01.JavaSE\05.OOP\06.package\example3> javac  ./importTest/Main.java
D:\Projects\LearnJava\01.JavaSE\05.OOP\06.package\example3> java importTest.Main
This is Person's hello method!
Hello import!
```





对于example4、example5：编写代码和运行即可

对于example6：

```
D:\Projects\LearnJava\01.JavaSE\05.OOP\06.package\example6> javac -d ./example6/bin ./example6/emilia/Person.java  ./example6/ram/Person.java  ./example6/rem/Person.java


D:\Projects\LearnJava\01.JavaSE\05.OOP\06.package\example6> tree /f
D:.
├─bin
│  ├─emilia
│  │      Person.class
│  │
│  ├─ram
│  │      Person.class
│  │
│  └─rem
│          Person.class
│
├─emilia
│      Person.java
│
├─ram
│      Person.java
│
└─rem
        Person.java
```







