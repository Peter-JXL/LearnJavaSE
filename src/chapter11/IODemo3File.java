package chapter11;

import java.io.File;
import java.io.IOException;

public class IODemo3File {

  // show new a File class
  public static void main(String[] args)  throws IOException {
    File file = new File("HelloFile.txt");
    if(file.createNewFile()){
      System.out.println("Create File Success!");
    }
    
    if(file.delete()){
      System.out.println("Delete File Success!");
    }


    File file2 = File.createTempFile("temp", ".txt");
    System.out.println(file2.isFile()); //true
    System.out.println(file2.getAbsolutePath());  //C:\Users\peterjxl\AppData\Local\Temp\temp7845722632772728214.txt
    file2.deleteOnExit();
  }
}
