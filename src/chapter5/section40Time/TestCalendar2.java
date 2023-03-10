package chapter5.section40Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar2 {
  public static void main(String[] args) {

    //演示设置年月日时分秒
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, 2023); //设置年份
    c.set(Calendar.MONTH, 8); //设置月份，注意8表示9月.... 
    c.set(Calendar.DATE, 2);  //设置天数
    c.set(Calendar.MILLISECOND, 0);  //设置毫秒数
    c.set(Calendar.HOUR_OF_DAY, 21); 
    c.set(Calendar.MINUTE, 30); 
    c.set(Calendar.SECOND, 45); 
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf.format(c.getTime()));  //2023-09-02 21:30:45

    //一次性设置Calendar
    c.set(2019, 10,20,8,15,0);
    System.out.println(c.getTime());  //Wed Nov 20 08:15:00 CST 2019

    //演示重置Calendar
    c.clear();
    System.out.println(c.getTime());  //Thu Jan 01 00:00:00 CST 1970

    //演示比较Calendar
    Calendar c2 = Calendar.getInstance();
    System.out.println(c.compareTo(c2));  //-1
  }
}
