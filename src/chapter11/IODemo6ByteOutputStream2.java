package chapter11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IODemo6ByteOutputStream2 {
  public static void main(String[] args) throws IOException {
    byte[] data;
    try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
      output.write("HelloWrold!".getBytes());
      data = output.toByteArray();
    }
    System.out.println(new String(data, "UTF-8"));
  }
}
