package chapter9;


public class WrapperClassDemo7 {
  public static void main(String[] args) {
    Integer intObject = new Integer(5);
    Integer intObject2 = 5;

    System.out.println(intObject);
    System.out.println(intObject2);

    Integer[] intArray = {1,2,3};
    System.out.println(intArray[0] + intArray[1] + intArray[2]);
  }
}
