package chapter5.section40Time;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZonedDateTime2 {
  public static void main(String[] args) {
    ZonedDateTime zbShanghai = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    ZonedDateTime zbNewWork = zbShanghai.withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println(zbShanghai);
    System.out.println(zbNewWork);
  }
}
