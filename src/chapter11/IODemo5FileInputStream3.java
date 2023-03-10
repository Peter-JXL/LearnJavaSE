package chapter11;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class IODemo5FileInputStream3 {
  public static void main(String[] args) throws IOException {
    try (InputStream input = new FileInputStream("readme.txt")) {      
      byte[] buffer = new byte[100];
      int n = input.read(buffer);
      System.out.println(n);  //3
    }
  }
}
