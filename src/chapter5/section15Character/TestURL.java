package chapter5.section15Character;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestURL {
  public static void main(String[] args) throws Exception{
    String encoded = URLEncoder.encode("中文!", "UTF-8");
    System.out.println(encoded);  //%E4%B8%AD%E6%96%87%21


    String decoString = URLDecoder.decode("%E4%B8%AD%E6%96%87%21", "UTF-8");
    System.out.println(decoString);
  }
}
