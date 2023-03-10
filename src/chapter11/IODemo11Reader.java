package chapter11;

import java.io.FileReader;

public class IODemo11Reader {
  public static void main(String[] args) throws Exception{
    
    FileReader reader = new FileReader("readme.txt");

    int n = reader.read();
    while(-1 != n){
      System.out.println((char)n);
      n = reader.read();
    }

    reader.close();
  }
}
