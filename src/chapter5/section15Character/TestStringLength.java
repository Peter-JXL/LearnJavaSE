package chapter5.section15Character;
public class TestStringLength {
  public static void main(String[] args) {
    String str = "A";
    System.out.println(str.length());

    String str2 = "😂";
    System.out.println(str2.length());
    System.out.println(str2.codePointCount(0,str2.length())); //输出1
    
  }
}
