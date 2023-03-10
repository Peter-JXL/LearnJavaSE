package chapter5.section40Time;

import java.util.Calendar;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    int y = c.get(Calendar.YEAR);
    int m = c.get(Calendar.MONTH) + 1;
    int d = c.get(Calendar.DAY_OF_MONTH);
    int w = c.get(Calendar.DAY_OF_WEEK);
    int hh = c.get(Calendar.HOUR_OF_DAY);
    int mm = c.get(Calendar.MINUTE);
    int ss = c.get(Calendar.SECOND);
    int ms = c.get(Calendar.MILLISECOND);
    System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);
  }
}
