package chapter5DataType;

public class TestDoubleToRawLongBits {
  public static void main(String[] args) {
    double d  = 1;
    System.out.println(Double.doubleToRawLongBits(d));

    double d2 = 0.1;
    System.out.println(Double.doubleToRawLongBits(d2));
  }
}
