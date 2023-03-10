package chapter11;

import java.io.FileInputStream;
import java.util.Properties;

public class IODemo8Properties {
  public static void main(String[] args) throws Exception{
    String filename = "setting.properties";
    Properties props = new Properties();
    props.load(new FileInputStream(filename));

    String last_open_file = props.getProperty("last_open_file");
    String auto_save_interval = props.getProperty("auto_save_interval");
    String testDefault = props.getProperty("testDefault", "aaa");

    System.out.println("last_open_file: " + last_open_file);
    System.out.println("auto_save_interval: " + auto_save_interval);
    System.out.println("testDefault: " + testDefault);
  }
}
