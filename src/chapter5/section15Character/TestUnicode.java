package chapter5.section15Character;
public class TestUnicode {
  public static void main(String[] args) {
    String str = "严";
    System.out.println(str.codePointAt(0));

    str = "\u4E25";
    System.out.println(str);
  }
}
