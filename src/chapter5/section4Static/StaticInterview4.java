package chapter5.section4Static;

public class StaticInterview4 {
  Person4 person = new Person4("Test");
  static {
    System.out.println("test static");
  }

  public StaticInterview4() {
    System.out.println("test constructor");
  }

  public static void main(String[] args) {
    new MyClass();
  }
}

class Person4 {
  static {
    System.out.println("person static");
  }

  public Person4(String str) {
    System.out.println("person " + str);
  }
}

class MyClass extends StaticInterview4 {
  Person4 person = new Person4("MyClass");
  static {
    System.out.println("myclass static");
  }

  public MyClass() {
    System.out.println("myclass constructor");
  }
}
