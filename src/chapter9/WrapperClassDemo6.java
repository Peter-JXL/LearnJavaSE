package chapter9;

public class WrapperClassDemo6 {
  public static void main(String[] args) {
    System.out.println(Integer.parseInt("11"));
    System.out.println(Integer.parseInt("11",2));
    System.out.println(Integer.parseInt("11",8));
    System.out.println(Integer.parseInt("11",16));
    
    System.out.println(String.format("%x", 26)); //将26转为十六进制，也就是1a
  }
}
