package chapter20Java8;

import java.util.Arrays;

public class LearnLambda2 {
  public static void main(String[] args) {
    String[] array = {"Apple", "Orange", "Banana", "Lemon"};
    Arrays.sort(array, LearnLambda2::cmp);  //Apple, Banana, Lemon, Orange
    System.out.println(String.join(", ", array));

    Arrays.sort(array, String::compareTo);
  }

  static int cmp(String s1, String s2){
    return s1.compareTo(s2);
  }

}
