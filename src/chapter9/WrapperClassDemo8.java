package chapter9;

import java.util.Objects;

public class WrapperClassDemo8 {
  public static void main(String[] args) {
   
    long long1 = 1000L;
    Integer integer = 1000;
    System.out.println( long1 == integer);  //true
    System.out.println( integer.equals(long1)); //flase


    Long longClass = 1000L;
    System.out.println(Objects.equals(longClass, integer));//flase
  }
}
