package chapter5.section40Time;
import java.time.*;

public class TestDurationAndPeriod {
  public static void main(String[] args) {
    // display Duration
    LocalDateTime start = LocalDateTime.of(2022, 5, 21, 0, 0, 0);
    LocalDateTime end = LocalDateTime.of(2022, 5, 22, 8, 25, 30);
    Duration d = Duration.between(start, end);
    System.out.println("Duration.between(start, end): " + d); // PT32H25M30S mean 32hour, 25min and 30sec
    d = Duration.between(end, start);
    System.out.println("Duration.between(end, start): " + d); // PT32H25M30S mean 32hour, 25min and 30sec


    // display Period
    LocalDate startDay = LocalDate.of(2022, 5, 21);
    LocalDate endDay = LocalDate.of(2022, 12, 22);
    Period p = startDay.until(endDay);
    System.out.println("startDay.until(endDay): " + p); // P7M1D, mean 7 month and 1 day
    p = endDay.until(startDay);
    System.out.println("endDay.until(startDay): " + p); // P-7M-1D

    
    Duration d1 = Duration.ofSeconds(10); // PT10S
    Duration d2 = Duration.parse("PT32H25M30S");
    System.out.println("Duration.ofSeconds(10): " + d1);
    System.out.println("Duration.parse(\"PT32H25M30S\"): " + d2);

  }
}
