package chapter9;

public class LearnExceptionDemo4 {
  public static void main(String[] args) {
    try {
      Integer.parseInt("abc");
    } catch (Exception e) {
      System.out.println("catched");
      throw new RuntimeException(e);
    }finally {
      System.out.println("finally");
      throw new IllegalArgumentException();
    }
  }
}
