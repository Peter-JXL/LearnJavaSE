package chapter9;

// 演示BigDecimal的equals方法的注意点，参考博客 https://www.peterjxl.com/JavaSE/BigDecimal-why/
import java.math.BigDecimal;

public class BigDecimalDemo5 {

  public static void main(String[] args) {
    BigDecimal bigDecimal = new BigDecimal(1);
    BigDecimal bigDecimal1 = new BigDecimal(1);
    System.out.println(bigDecimal.equals(bigDecimal1));

    BigDecimal bigDecimal2 = new BigDecimal(1);
    BigDecimal bigDecimal3 = new BigDecimal(1.0);
    System.out.println(bigDecimal2.equals(bigDecimal3));

    BigDecimal bigDecimal4 = new BigDecimal("1");
    BigDecimal bigDecimal5 = new BigDecimal("1.0");
    System.out.println(bigDecimal4.equals(bigDecimal5));
  }
}
