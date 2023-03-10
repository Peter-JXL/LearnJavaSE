package chapter5.section2Interface;

public class TestDefault {
  public static void main(String[] args) {
    InterfaceWithDefault stu = new Student("Peter JXL");  
    stu.run();
  }
}

class Student implements InterfaceWithDefault{
  private String name;

  public Student(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}
