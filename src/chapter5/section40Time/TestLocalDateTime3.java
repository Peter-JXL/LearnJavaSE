package chapter5.section40Time;
import java.time.LocalDateTime;

public class TestLocalDateTime3 {
  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.of(2022,5, 21, 13, 14, 15);
    dt = dt.withYear(2122);
    dt = dt.withHour(05); //调整成5点
    System.out.println(dt); //2122-05-21T05:14:15
  }
}
