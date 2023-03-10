package chapter9;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal(1.0);
    BigDecimal b = new BigDecimal(3);
    System.out.println("ROUND_UP:      " +  a.divide(b, 20, BigDecimal.ROUND_UP));  //0.33333333333333333334
    System.out.println("ROUND_DOWN:    " +  a.divide(b, 20, BigDecimal.ROUND_DOWN));  //0.33333333333333333333
    System.out.println("ROUND_CEILING: " +  a.divide(b, 20, BigDecimal.ROUND_CEILING));  //0.33333333333333333334
    System.out.println("ROUND_FLOOR:   " +  a.divide(b, 20, BigDecimal.ROUND_FLOOR));  //0.33333333333333333333
    System.out.println("ROUND_HALF_UP: " +  a.divide(b, 20, BigDecimal.ROUND_HALF_UP));  //0.33333333333333333333


    BigDecimal d = new BigDecimal("-1");
    BigDecimal e = new BigDecimal("3");
    System.out.println("ROUND_UP:      " +  d.divide(e, 20, BigDecimal.ROUND_UP)); //-0.33333333333333333334
    System.out.println("ROUND_DOWN:    " +  d.divide(e, 20, BigDecimal.ROUND_DOWN)); //-0.33333333333333333333
    System.out.println("ROUND_CEILING: " +  d.divide(e, 20, BigDecimal.ROUND_CEILING)); //-0.33333333333333333333
    System.out.println("ROUND_FLOOR:   " +  d.divide(e, 20, BigDecimal.ROUND_FLOOR)); //-0.33333333333333333334
    System.out.println("ROUND_HALF_UP: " +  d.divide(e, 20, BigDecimal.ROUND_HALF_UP)); //-0.33333333333333333334

    BigDecimal f = new BigDecimal("0.7");
    BigDecimal g = new BigDecimal("2");
    System.out.println("ROUND_HALF_UP:   " +  f.divide(g, 1, BigDecimal.ROUND_HALF_UP)); //0.4
    System.out.println("ROUND_HALF_DOWN: " +  f.divide(g, 1, BigDecimal.ROUND_HALF_DOWN)); //0.3
  }
}
