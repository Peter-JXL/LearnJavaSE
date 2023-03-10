package chapter5.section2Interface;

public class Student2 implements Person {
  private String name;
  public Student2(){

  }

  @Override
  public void run(){
    System.out.println(this.name + " run ");
  }

  @Override
  public String getName() {
    return null;
  }


}
