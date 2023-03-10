package chapter5.section40Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.getYear());
    System.out.println(date.getMonth());
    System.out.println(date.getDate());
    System.out.println(date.toString());
    System.out.println(date.toGMTString());
    System.out.println(date.toLocaleString());

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf.format(date));

    //返回毫秒数
    long t = Date.parse("Mon 6 Jan 1997 13:3:00");
    System.out.println(t);  //852526980000

    //Date的构造方法，不推荐使用
    Date date2 = new Date("Mon 6 Jan 1997 13:3:00");
    System.out.println(date2);
  }
}
