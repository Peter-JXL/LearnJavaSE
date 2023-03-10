package chapter11;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class IODemo5FileInputStream4 {
  public static void main(String[] args) throws IOException {
    byte[] data = {114,5,14};
    try (InputStream input = new ByteArrayInputStream(data)) {      
      int n;
      while ((n = input.read()) != -1) {
          System.out.println(n);  //114,5,14
      }
    }
  }
}
