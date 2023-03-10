package chapter11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IODemo10Seri {
  public static void main(String[] args) {
    Person JXL = new Person("JXL");
    try (
      FileOutputStream fop = new FileOutputStream("objectFile");
      ObjectOutputStream oos = new ObjectOutputStream(fop);
    ) {
      oos.writeInt(114514);
      oos.writeUTF("Hello World!");
      oos.writeObject(JXL);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (
      FileInputStream fis = new FileInputStream("objectFile");
      ObjectInputStream ois = new ObjectInputStream(fis);
    ) {
      int n = ois.readInt();
      String s = ois.readUTF();
      Person JXL2 = (Person)ois.readObject();

      System.out.println("n: " + n);
      System.out.println("s: " + s);
      System.out.println("JXL2: " + JXL2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


class Person implements Serializable{
  private String name;
  public Person(String name){
    this.name = name;
  }

  @Override 
  public String toString(){
    return this.name;
  }
}