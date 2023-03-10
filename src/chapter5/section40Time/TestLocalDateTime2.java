package chapter5.section40Time;

import java.time.LocalDateTime;

public class TestLocalDateTime2 {
  public static void main(String[] args) {

    LocalDateTime dt = LocalDateTime.of(2022,5, 21, 13, 14, 15);
    dt = dt.plusDays(5);  // add 5 days
    dt = dt.minusDays(1);  // sub 1 day
    dt = dt.plusHours(1); //sub 1 hour
    dt = dt.minusHours(3); //add 3 hours
    System.out.println(dt); //2022-05-25T11:14:15

    dt = LocalDateTime.of(2022,5, 21, 13, 14, 15);
    dt = dt.plusDays(5).minusDays(1).plusHours(1).minusHours(3);
    System.out.println(dt); //2022-05-25T11:14:15
  }
}
