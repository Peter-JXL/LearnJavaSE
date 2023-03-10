package chapter11;

import java.io.InputStream;
import java.util.Properties;

public class IODemo9ClassPath {
  public static void main(String[] args) {
    try (InputStream input = IODemo9ClassPath.class.getResourceAsStream("/default.properties")) {
      Properties props = new Properties();
      props.load(input);

      String last_open_file = props.getProperty("last_open_file");
      System.out.println("last_open_file: " + last_open_file);


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
