package chapter5.section1Inherit;

public class LearnInnerClass3 {
  public static void main(String[] args) {
    Outer2 outer = new Outer2("peterjxl");
    outer.sayHello();
  }
}


class Outer2{
  private String name;

  Outer2(String name){
    this.name = name;
  }

  void sayHello(){
    Runnable r = new Runnable() {
      @Override
      public void run(){
        System.out.println("Hello, " + Outer2.this.name);
      }
    };
    new Thread(r).start();
  }
}