package chapter5.section40Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestDateTimeFormatter {
  public static void main(String[] args) {
    //自定义格式化
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    System.out.println(dtf.format(LocalDateTime.now()));


    //解析字符串
    LocalDateTime dt = LocalDateTime.parse("2022/05/21 21:13:14", dtf);
    System.out.println(dt);

    DateTimeFormatter dftUS = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm", Locale.US);
    DateTimeFormatter dftChina = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm", Locale.CHINA);
    System.out.println(dftUS.format(LocalDateTime.now()));
    System.out.println(dftChina.format(LocalDateTime.now()));

  }
}
