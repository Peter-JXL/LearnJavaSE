package chapter10Exception;
public class LearnExceptionDemo1 {
  public static void main(String[] args) {
    Person p = new Student();
    System.out.println(p instanceof Person);
    
  }
}


class Person{
  void run(){
    System.out.println("person run!");
  }
}

class Student extends Person{
  
  @Override
  void run() {
    System.out.println("student run!");
  }
}