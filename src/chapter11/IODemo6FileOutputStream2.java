package chapter11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IODemo6FileOutputStream2 {
  public static void main(String[] args) throws IOException {
    OutputStream output = new FileOutputStream("readme.txt");
    output.write("HelloWorld".getBytes("UTF-8"));
    output.close();
  }
}
