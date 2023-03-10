package chapter5.section40Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar3 {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    Calendar c = Calendar.getInstance();
    c.set(2022,11,22,7,48,00);
    System.out.println(sdf.format(c.getTime()));  //2022-12-22 07:48:00

    c.add(Calendar.DAY_OF_MONTH, 5);
    c.add(Calendar.SECOND, -1);
    System.out.println(sdf.format(c.getTime()));
  }
}
