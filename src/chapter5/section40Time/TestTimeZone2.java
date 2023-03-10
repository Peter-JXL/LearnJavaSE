package chapter5.section40Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TestTimeZone2 {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar c = Calendar.getInstance();


    c.clear();
    c.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
    c.set(2022, 11,22,7,57,00);
    System.out.println("北京时间: " + sdf.format(c.getTime()));

    sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    System.out.println("纽约时间: " + sdf.format(c.getTime()));
  }
}
