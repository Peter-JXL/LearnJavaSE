package chapter5.section40Time;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestInstant {
  public static void main(String[] args) {
    Instant now = Instant.now();
    System.out.println(now.getEpochSecond()); //秒  1672133167
    System.out.println(now.toEpochMilli()); // 毫秒 1672133167386

    Instant g = Instant.ofEpochSecond(1672133167);
    ZonedDateTime zdt = g.atZone(ZoneId.systemDefault());
    System.out.println(zdt);

    Instant g2 = Instant.ofEpochMilli(1672133167386L);
    ZonedDateTime zdt2 = g2.atZone(ZoneId.systemDefault());
    System.out.println(zdt2);
  }
}
