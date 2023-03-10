package chapter5.section1Inherit;

public class LearnInnerClass2 {
  public static void main(String[] args) {
    new Outer("PeterJXL").sayHello();
  }
}


class Outer{

  private String name;

  public Outer(String name){
    this.name = name;
  }

  public void sayHello(){
    new inner().run();
  }

  class inner implements Runnable{
    @Override
    public void run(){
      System.out.println("Hello, " + Outer.this.name);
    }
  }
}
