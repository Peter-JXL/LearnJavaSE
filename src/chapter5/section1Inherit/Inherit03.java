package chapter5.section1Inherit;

//在创建子类对象的时候，会初始化父类的成员变量。例如这里会初始化 personName变量
public class Inherit03 {
  public static void main(String[] args) {
    Teacher t = new Teacher();
    System.out.println(t.personName);
  }
}


class Person{
  public String personName = "PersonName";
}


class Teacher extends Person{
  
}
