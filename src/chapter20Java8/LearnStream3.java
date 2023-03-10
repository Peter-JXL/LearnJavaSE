package chapter20Java8;

import java.util.Arrays;

public class LearnStream3 {
  public static void main(String[] args) {
    Arrays.asList(" Peter ", "JXL", "heLLo")
    .stream()
    .map(String::trim)
    .map(String::toLowerCase)
    .forEach(System.out::println);
  }
}
