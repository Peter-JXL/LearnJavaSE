package chapter20Java8;

public class OptionalDemo1NPE {
  public static void main(String[] args) {
    String s = null;
    s.equals("hello");  // throw NPE
  }
}
