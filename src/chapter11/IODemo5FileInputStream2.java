package chapter11;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class IODemo5FileInputStream2 {
  public static void main(String[] args) throws IOException {
    try (InputStream input = new FileInputStream("readme.txt")) {
      int n;
      while( -1 != (n = input.read())){
        System.out.println(n);
      }
    }
  }
}
