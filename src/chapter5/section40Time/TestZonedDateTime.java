package chapter5.section40Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZonedDateTime {
  public static void main(String[] args) {
    ZonedDateTime zb = ZonedDateTime.now(); //default Zone
    ZonedDateTime zbNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println(zb);
    System.out.println(zbNewYork);

    LocalDateTime dt = LocalDateTime.of(2022,5,21,8,35,0);
    ZonedDateTime zb2 = dt.atZone(ZoneId.systemDefault());
    ZonedDateTime zbNewYork2 = dt.atZone(ZoneId.of("America/New_York"));
    System.out.println(zb2);
    System.out.println(zbNewYork2);

  }
}
