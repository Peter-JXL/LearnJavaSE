package chapter20Java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class LearnStream1 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("A", "B", "C", "D");
    stream.forEach(System.out::print);
    System.out.println();

    Stream<String> stream2 = Arrays.stream(new String[]{"A", "B", "C", "D"});
    Stream<String> stream3 = Arrays.asList("A", "B", "C", "D").stream();
    
    stream2.forEach(System.out::print);
    System.out.println();

    stream3.forEach(System.out::print);

  }
}
