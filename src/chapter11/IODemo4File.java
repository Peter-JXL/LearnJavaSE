package chapter11;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class IODemo4File {

  public static void main(String[] args) throws IOException {
    new File("./testMkdir").mkdir();
    new File("./testMkdir/aaa/bbb").mkdirs();

    new File("./testMkdir/aaa.txt").createNewFile();
    new File("./testMkdir/aaa/bbb/bbb.txt").createNewFile();
    new File("./testMkdir/aaa/bbb/B.java").createNewFile();

    String[] strs = new File("./testMkdir").list();
    for (String string : strs) {
      System.out.println(string);
    }

    File[] files = new File("./testMkdir").listFiles();
    for (File f : files) {
      System.out.println(f);
    }

    File[] files2 = new File("./testMkdir").listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name){
        return name.endsWith(".txt");
      }
    });

    for (File f : files2) {
      System.out.println(f);
    }
  }
}
