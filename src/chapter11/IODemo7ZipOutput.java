package chapter11;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IODemo7ZipOutput {
  public static void main(String[] args){
    File file = new File("readme.txt");
    File fileZip = new File("readme.zip");
    try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(fileZip))) {
      zip.putNextEntry(new ZipEntry(file.getPath()));
      zip.write(Files.readAllBytes(file.toPath()));
      zip.closeEntry();
    } catch (Exception e) {
      e.printStackTrace();
    } 
     
  }
}
