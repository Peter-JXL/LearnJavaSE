package chapter5.section40Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
public class TestLocalDateTime {
  public static void main(String[] args) {

    //基本使用
    LocalDate d = LocalDate.now();
    LocalTime t = LocalTime.now();
    LocalDateTime dt = LocalDateTime.now();

    System.out.println(d);
    System.out.println(t);
    System.out.println(dt);


    //演示构造方法
    LocalDate d2 = LocalDate.of(2022, 5, 21);
    LocalTime t2 = LocalTime.of(13,14, 15);
    LocalDateTime dt2 = LocalDateTime.of(2022,5, 21, 13, 14, 15);
    LocalDateTime dt3 = LocalDateTime.of(d2, t2);

    System.out.println("d2: " + d2);
    System.out.println("t2: " + t2);
    System.out.println("dt2: " + dt2);
    System.out.println("dt3: " + dt3);

    LocalDate d3 = dt2.toLocalDate();
    LocalTime t3 = dt2.toLocalTime();
    System.out.println("d3: " + d3);  //d3: 2022-05-21
    System.out.println("t3: " + t3);   //t3: 13:14:15

    LocalTime t4 = LocalTime.now();
    LocalTime t5 = LocalTime.now();
    System.out.println(t4.compareTo(t5));  //-1

    // 通过字符串创建对象
    LocalDateTime dt4 = LocalDateTime.parse("2022-05-21T21:13:14");
    LocalDate d4 = LocalDate.parse("2022-05-21");
    LocalTime t6 = LocalTime.parse("15:16:17");
    
    LocalDateTime ldt = LocalDateTime.of(2022, 1, 1, 2, 3, 4, 56789);//2022-1-1 2:3:1
    int i1 = ldt.get(ChronoField.MINUTE_OF_DAY);    //123  指的是目前已经过了2*小时 + 3分钟= 123分钟了
    int i2 = ldt.get(ChronoField.MINUTE_OF_HOUR);    //3 指的是目前在当前这个小时内，已经过了3分钟
    System.out.println(i1);
    System.out.println(i2);
  }
}
