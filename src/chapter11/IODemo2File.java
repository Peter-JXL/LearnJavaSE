package chapter11;

import java.io.File;
import java.io.IOException;

public class IODemo2File {

  // show new a File class
  public static void main(String[] args)  throws IOException {
    File f1 = new File("C:\\Windows");
    File f2 = new File("C:\\Windows\\notepad.exe");
    File f3 = new File("C:\\Windows\\nothing"); // 一个不存在的目录

    System.out.println(f1.isFile());
    System.out.println(f1.isDirectory());
    System.out.println(f1.canRead());
    System.out.println(f1.canWrite());
    System.out.println(f1.canExecute());
    System.out.println(f1.length());

    
    System.out.println(f2.isFile());
    System.out.println(f2.isDirectory());
    System.out.println(f2.canRead());
    System.out.println(f2.canWrite());
    System.out.println(f2.canExecute());
    System.out.println(f2.length());

    
    System.out.println(f3.isFile());
    System.out.println(f3.isDirectory());
    System.out.println(f3.canRead());
    System.out.println(f3.canWrite());
    System.out.println(f3.canExecute());
    System.out.println(f3.length());

  }
}
