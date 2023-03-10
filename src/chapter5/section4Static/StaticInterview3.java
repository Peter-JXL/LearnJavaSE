package chapter5.section4Static;
public class StaticInterview3 {
  public static void main(String[] args) {
    new Test2();
  }
}


class Test extends Base{

  static{
      System.out.println("test static");
  }
 
  public Test(){
      System.out.println("test constructor");
  }
 
  public static void main(String[] args) {
      new Test2();
  }
}

class Base{
 
  static{
      System.out.println("base static");
  }
 
  public Base(){
      System.out.println("base constructor");
  }
}
