package chapter20Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnLambda3 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "JXL", "Hello");
    List<Person> persons = new ArrayList<>();
    for (String name : names) {
      persons.add(new Person(name));
    }
    System.out.println("persons: " + persons);

    List<Person> persons2 = names.stream().map(Person::new).collect(Collectors.toList());
    System.out.println("persons2: " + persons2);

  }
}

class Person{
  String name;
  public Person(String name){
    this.name = name;
  }
  
  public String toString() {
    return "Person:" + this.name;
  }
}
