package chapter11;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IODemo11Reader2Encode {
  public static void main(String[] args) throws Exception{
    
    FileInputStream fis = new FileInputStream("readme.txt");
    InputStreamReader  reader = new InputStreamReader(fis,"UTF-8");


    String str = "";
    int n = 0; 
    while(-1 != (n = reader.read())){      
      str += (char)n;
    }

    System.out.println(str);
    reader.close();
  }
}
