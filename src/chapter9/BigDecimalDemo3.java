package chapter9;
// 比较double和BigDecimal的执行效率，参考博客https://www.peterjxl.com/JavaSE/BigDecimal
import java.math.BigDecimal;

public class BigDecimalDemo3 {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    double d = 1.0;
    for(int i = 0; i < 100000; i++){
      d++;
    }
    long endTime = System.currentTimeMillis();
    System.out.println("double程序运行时间：" + (endTime - startTime) + "ms");

    startTime = System.currentTimeMillis();
    BigDecimal b = new BigDecimal("1.0");
    for(int i = 0; i < 100000; i++){
      b.add(b);
    }
    endTime = System.currentTimeMillis();
    System.out.println("BigDecimal程序运行时间：" + (endTime - startTime) + "ms");

  }
}
