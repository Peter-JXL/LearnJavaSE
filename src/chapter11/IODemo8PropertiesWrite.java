package chapter11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class IODemo8PropertiesWrite {
  public static void main(String[] args) throws Exception{
    String filename = "setting.properties";
    Properties props = new Properties();
    props.load(new FileInputStream(filename));

    props.setProperty("myWebsite", "www.peterjxl.com");
    props.store(new FileOutputStream(filename), "comment");
  }
}
