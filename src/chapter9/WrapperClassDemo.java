package chapter9;

// 演示包装类的构造方法

public class WrapperClassDemo{
  public static void main(String[] args) {
    byte b = 1;
    Byte byte1 = new Byte(b);
    Byte byte2 = new Byte("112");
    System.out.println("Byte: " + byte1 + ' ' + byte2);

    short s = 1;
    Short short1 = new Short(s);
    Short short2 = new Short("112");
    System.out.println("Short:"  + short1 + ' ' + short2);

    Integer int1 = new Integer(111);
    Integer int2 = new Integer("112");
    System.out.println("Integer:"  + int1 + ' ' + int2);

    Long long1 = new Long(111L);
    Long long2 = new Long("112");
    System.out.println("Long:"  + long1 + ' ' + long2);

    Float float1 = new Float(11.1f);
    Float float2 = new Float("11.2");
    System.out.println("Float:"  + float1 + ' ' + float2);

    Double double1 = new Double(11.1);
    Double double2 = new Double("111.22");
    System.out.println("Double:"  + double1 + ' ' + double2);


    char c = 'A';
    Character char1 = new Character(c);
    Character char2 = new Character('A');
    System.out.println("Character:"  + char1 + ' ' + char2);

    Boolean boolean1 = new Boolean("true");
    Boolean boolean2 = new Boolean("True");
    Boolean boolean3 = new Boolean(true);
    System.out.println("Boolean:"  + boolean1 + ' ' + boolean2 + ' ' + boolean3);
  }
}

