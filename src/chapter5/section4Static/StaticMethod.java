package chapter5.section4Static;
public class StaticMethod {
  public static void main(String[] args) {
    Person7.setNumber(99);
    System.out.println(Person7.number);
  }
}

class Person7 {

  public static int number;
  public static void setNumber(int value){
    number =  value;
  }

}

