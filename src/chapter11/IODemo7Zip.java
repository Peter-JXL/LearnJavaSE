package chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class IODemo7Zip {
  public static void main(String[] args) throws IOException{
    try ( 
      FileInputStream file = new FileInputStream("readme.zip");
      ZipInputStream zip = new ZipInputStream(file)) {

        ZipEntry entry = null;
        
        while(null != ( entry = zip.getNextEntry())){
          if(!entry.isDirectory()){
            int n;
            while( -1 != (n = zip.read())){
              System.out.println(n);
            }
          }
        }


    }
  }
}
