package chapter5.section4Static;
/*
因为`interface`是一个纯抽象类，所以它不能定义实例字段。
但是，`interface`是可以有静态字段的，并且静态字段必须为`final`类型：
*/
public interface Person {

  public static final int MALE = 1;
  public static final int FEMALE = 2;

}

interface InnerPerson {
  // 编译器会自动加上public statc final，因此Person接口可简写为:
  int MALE = 1;
  int FEMALE = 2;
}
