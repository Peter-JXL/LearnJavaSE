package chapter9;

public class WrapperClassDemo5 {
  public static void main(String[] args) {
    int b1 = new Double(12.4).compareTo(new Double(12.3));
    int b2 = new Double(12.3).compareTo(new Double(12.3));
    int b3 = new Double(12.3).compareTo(new Double(12.4));

    System.out.println("b1: " + b1);
    System.out.println("b2: " + b2);
    System.out.println("b3: " + b3);
  }
}
