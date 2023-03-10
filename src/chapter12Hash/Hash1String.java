package chapter12Hash;

public class Hash1String {
  public static void main(String[] args) {
    System.out.println("hello".hashCode()); //99162322
    System.out.println("hello, java".hashCode()); //2057144552
    System.out.println("hello, peter".hashCode());  //-647369722

    System.out.println("AaAaAa".hashCode());  //1952508096
    System.out.println("BBAaBB".hashCode());  //1952508096
  }
}
