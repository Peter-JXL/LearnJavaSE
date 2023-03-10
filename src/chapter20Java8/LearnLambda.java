package chapter20Java8;
import java.util.Arrays;
import java.util.Comparator;

public class LearnLambda {
  public static void main(String[] args) {
    String[] array = {"peter", "jxl", "hello"};

    // Anonymous inner class
    Arrays.sort(array, new Comparator<String>() {
      public int compare(String s1, String s2){
        return s1.compareTo(s2);
      }
    });

    // Lambda
    Arrays.sort(array, (s1, s2) ->{
      return s1.compareTo(s2);
    });

    // most simple
    Arrays.sort(array, (s1, s2) -> s1.compareTo(s2));
  }
}
