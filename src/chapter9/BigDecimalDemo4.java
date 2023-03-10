package chapter9;

import java.math.BigDecimal;

public class BigDecimalDemo4 {
  public static void main(String[] args) {
    BigDecimal bigDecimal=new BigDecimal(88);
    System.out.println(bigDecimal);

    bigDecimal=new BigDecimal("8.8");
    System.out.println(bigDecimal);

    bigDecimal=new BigDecimal(8.8);
    System.out.println(bigDecimal);
  }
}
