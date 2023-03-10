package chapter5.section15Character;

/**
 * 对应博客地址：简单聊聊Unicode https://www.peterjxl.com/literacy/character-encoding-unicode
 */

public class TestStringGetBytes {
  public static void main(String[] args) throws  Exception {

    String str2 = "abcdefg";
    byte[] b = str2.getBytes();
    for(int i = 0; i < b.length; i++){
      System.out.println(b[i]); //输出97.98.99.100...103， 就是abcdefg的ASCII码
    }

    String str = "严";
    System.out.println("str.getBytes().length: "+ str.getBytes().length);
    System.out.println("str.getBytes(\"GBK\").length: "+ str.getBytes("GBK").length);
    System.out.println("str.getBytes(\"UTF-8\").length: "+ str.getBytes("UTF-8").length);

    byte[] b2 = "严".getBytes("utf-8");
    for (int i = 0; i < b2.length; i++) {
      System.out.print(b2[i]);
      System.out.print(" ");
      System.out.println(Integer.toBinaryString(b2[i]));
    }

    byte[] b3 = "赵".getBytes();
    for (int i = 0; i < b3.length; i++) {
      System.out.println(b3[i]);
    }
  }
}
