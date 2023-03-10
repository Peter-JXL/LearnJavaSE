package chapter5.section40Time;
import java.util.TimeZone;

public class TestTimeZone {
  public static void main(String[] args) {
    TimeZone tzDefault = TimeZone.getDefault(); //当前时区
    TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00");  //GMT + 9:00 时区
    TimeZone tzNewYork = TimeZone.getTimeZone("America/New_York"); //纽约时区

    System.out.println(tzDefault.getID());
    System.out.println(tzGMT9.getID());
    System.out.println(tzNewYork.getID());

    String str[] = TimeZone.getAvailableIDs();
    System.out.println(str.length);
    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
  }
}
