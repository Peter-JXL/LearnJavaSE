package chapter11;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.StringWriter;

public class IODemo12Writer {
  public static void main(String[] args) {

    //display FileWriter
    try (FileWriter writer = new FileWriter("readme.txt")) {
      writer.write('H');
      writer.write("Hello".toCharArray());
      writer.write("Wrold");
      writer.write("你好");
    } catch (Exception e) {
      e.printStackTrace();
    }

    // display CharArrayWriter
    try (CharArrayWriter writer = new CharArrayWriter()) {
      writer.write(65);
      writer.write(66);
      writer.write(67);
      System.out.println(writer.toCharArray()); //ABC
    } catch (Exception e) {
      e.printStackTrace();
    }

    // display StringWriter
    try (StringWriter writer = new StringWriter()) {
      writer.write("你好");
      System.out.println(writer.toString());//你好
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
