package chapter5.section4Static;
//练习 给`Person`类增加一个静态字段`count`和静态方法`getCount()`，统计实例创建的个数。
public class StaticPractise {
  public static void main(String[] args) {
    System.out.println(Person10.getCount());
    Person10 p = new Person10();
    System.out.println(Person10.getCount());
  }
}



class Person10 {
  public static int count = 0;
  public static int getCount(){
    return count;
  }

  public Person10(){
    count++;
  }
}