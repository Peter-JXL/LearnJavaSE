package chapter5.section4Static;
public class StaticCode {

  static{
    int num = 1;
    System.out.println("static code execute!");
  }
  public static void main(String[] args) {
    StaticCode t = new StaticCode();
    System.out.println("Static main execute!");
    StaticCode t2 = new StaticCode();
  }
}
