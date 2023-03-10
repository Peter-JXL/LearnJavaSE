package chapter5.section4Static;

public class StaticField {
  public static void main(String[] args) {
    Person11 ming = new Person11("xiao ming", 0);
    Person11 hong = new Person11("xiao hong", 0);

    ming.number = 88;
    System.out.println(hong.number);  //88

    hong.number = 99;
    System.out.println(ming.number);  //99

    Person11.number = 100;  //recommend
    System.out.println(Person11.number);
  }
}

class Person11 {
  public String name;
  public int age;

  // 定义静态字段number:
  public static int number;

  public Person11(String name, int age){
    this.name = name;
    this.age = age;
  }

}
