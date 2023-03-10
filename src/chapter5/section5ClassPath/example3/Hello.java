package chapter5.section5ClassPath.example3;

import chapter5.section5ClassPath.example3.lib.Person;

public class Hello{
  public static void main(String[] args){
    Person person = new Person("Peter");
      System.out.println(person.getName());
  }
}

