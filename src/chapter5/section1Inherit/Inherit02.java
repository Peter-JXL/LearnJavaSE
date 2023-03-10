package chapter5.section1Inherit;

/*
 * 演示构造方法链，执行的结果如下：
 *  > javac Inherit02.java
    > java Inherit02        
    (1) Execute Person2's construct method.
    (2) Invoke Employee's overloaded constructor
    (3) Execute Person2's construct method.
    (4) Execute Person2's construct method.
 */
public class Inherit02 {
  public static void main(String[] args) {
    new Faculty();
  }
}

class Faculty extends Employee{
  public Faculty(){
    System.out.println("(4) Execute Person's construct method.");
  }
}

class Employee extends Person2{
  public Employee(){
    this("(2) Invoke Employee's overloaded constructor");
    System.out.println("(3) Execute Person's construct method.");
  }

  public Employee(String s){
    System.out.println(s);
  }
}

class Person2{
  public Person2(){
    System.out.println("(1) Execute Person's construct method.");
  }
}
