package chapter11;

import java.io.File;
import java.io.IOException;

public class IODemo1File {

  // show new a File class
  public static void main(String[] args)  throws IOException {
    File f = new File("C:\\Windows\\notepad.exe");
    System.out.println(f);  //output: C:\Windows\notepad.exe

    File f2 = new File("test.txt");
    System.out.println(f2);
    System.out.println(f2.getName()); //test.txt

    // display OS's separator
    System.out.println(File.separator); // print "\" or "/"


    // show File's method about path
    File f3 = new File("..");
    System.out.println(f3.getPath());           //..
    System.out.println(f3.getAbsoluteFile());   //D:\Projects\LearnJava\01.JavaSE\11.IO\..
    System.out.println(f3.getCanonicalPath());  //D:\Projects\LearnJava\01.JavaSE
    System.out.println(f3.getName()); //..
  }
}
