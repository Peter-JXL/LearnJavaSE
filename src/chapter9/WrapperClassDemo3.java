package chapter9;

//演示 dataTypeValue方法
public class WrapperClassDemo3 {
  public static void main(String[] args) {
    Integer integer = new Integer(111);
    byte b1 = integer.byteValue();
    short s1 = integer.shortValue();
    int i1 = integer.intValue();
    long l1 = integer.longValue();
    float f1 = integer.floatValue();
    double d1 = integer.doubleValue();

    System.out.println("b1: " + b1);
    System.out.println("s1: " + s1);
    System.out.println("i1: " + i1);
    System.out.println("l1: " + l1);
    System.out.println("f1: " + f1);
    System.out.println("d1: " + d1);

    Boolean b = new Boolean(true);
    boolean boolean1 =  b.booleanValue();
    System.out.println("boolean1: " + boolean1);

    Character c = new Character('a');
    char c1 = c.charValue();
    System.out.println("c1: " + c1);
    

  }
}
