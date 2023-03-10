package chapter5.section1Inherit;

public class LearnInnerClass {
  public static void main(String[] args) {
    Outer3 outer = new Outer3("PeterJXL");
    Outer3.Inner inner = outer.new Inner();
    inner.helloInner();
  }

}

class Outer3{

  private String name;

  Outer3(String name ){
    this.name = name;
  }

  class Inner{
    void helloInner(){
      System.out.println("Hello " + Outer3.this.name);
    }
  }
}
