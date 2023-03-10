package chapter11;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class IODemo10Seri2 {
  public static void main(String[] args) {
    Person2 p = new Person2("jxl");

    // output
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectFile2"))) {
      oos.writeObject(p);
      
    } catch (Exception e) {
      e.printStackTrace();
    }

    //input
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectFile2"))) {
      Person2 p2 = (Person2)ois.readObject();
      System.out.println(p2);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


class Person2 implements Externalizable{
  private String name;

  public Person2(){}

  public Person2(String name){
    this.name = name;
  }

  @Override 
  public String toString(){
    return this.name;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(name);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = (String)in.readObject();
  }
}