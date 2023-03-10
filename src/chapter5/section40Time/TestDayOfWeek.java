package chapter5.section40Time;
import java.time.DayOfWeek;

public class TestDayOfWeek {
  public static void main(String[] args) {
    DayOfWeek d = DayOfWeek.of(4);
    System.out.println(d.name());  //THURSDAY
    System.out.println(d.getValue());  //4
  }
}
