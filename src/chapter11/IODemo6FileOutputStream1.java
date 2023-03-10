package chapter11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IODemo6FileOutputStream1 {
  public static void main(String[] args) throws IOException {
    OutputStream output = new FileOutputStream("readme.txt");
    output.write(72); // H
    output.write(101);  // e
    output.write(108);  // l
    output.write(108);  // l
    output.write(111);  // o
    output.close();
  }
}
