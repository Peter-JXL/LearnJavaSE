package chapter9;

public class WrapperClassDemo2 {
  public static void main(String[] args) {
    byte b = 1;
    Byte byte1 = Byte.valueOf(b);
    Byte byte2 = Byte.valueOf("112");
    System.out.println("Byte: " + byte1 + ' ' + byte2);

    short s = 1;
    Short short1 = Short.valueOf(s);
    Short short2 = Short.valueOf("112");
    System.out.println("Short:"  + short1 + ' ' + short2);

    Integer int1 = Integer.valueOf(111);
    Integer int2 = Integer.valueOf("112");
    System.out.println("Integer:"  + int1 + ' ' + int2);

    Long long1 = Long.valueOf(111L);
    Long long2 = Long.valueOf("112");
    System.out.println("Long:"  + long1 + ' ' + long2);

    Float float1 = Float.valueOf(11.1f);
    Float float2 = Float.valueOf("11.2");
    System.out.println("Float:"  + float1 + ' ' + float2);

    Double double1 = Double.valueOf(11.1);
    Double double2 = Double.valueOf("111.22");
    System.out.println("Double:"  + double1 + ' ' + double2);


    char c = 'A';
    Character char1 = Character.valueOf(c);
    Character char2 = Character.valueOf('A');
    System.out.println("Character:"  + char1 + ' ' + char2);

    Boolean boolean1 = Boolean.valueOf("true");
    Boolean boolean2 = Boolean.valueOf("True");
    Boolean boolean3 = Boolean.valueOf(true);
    System.out.println("Boolean:"  + boolean1 + ' ' + boolean2 + ' ' + boolean3);


  }
}
