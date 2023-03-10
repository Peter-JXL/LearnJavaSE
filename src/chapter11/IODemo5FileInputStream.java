package chapter11;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class IODemo5FileInputStream {
  public static void main(String[] args) throws IOException {
    InputStream input = null;
    int n;
    try {
      input = new FileInputStream("readme.txt");
      while (-1 != (n = input.read())) {
        System.out.println(n);
      }
    } finally {
      if(null != input)
        input.close();
    }

  }
}
