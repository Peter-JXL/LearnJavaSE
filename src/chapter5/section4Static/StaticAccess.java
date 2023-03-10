package chapter5.section4Static;
public class StaticAccess {
  public static void main(String[] args) {
    System.out.println(Person2.name);
    //System.out.println(Person2.age);
  }
}

class Person2{
  public static String name = "zhangsan";
  private static int age = 10;
}
