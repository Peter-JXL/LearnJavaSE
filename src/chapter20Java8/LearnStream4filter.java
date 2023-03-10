package chapter20Java8;

import java.util.stream.IntStream;

public class LearnStream4filter {
  public static void main(String[] args) {
    IntStream.of(1,2,3,4,5,6,7,8,9)
    .filter(n -> n % 2 !=0)
    .forEach(System.out::println);

    String s = null;
    s.equals("hello");

  }
}
