package chapter5.section4Static;

public class StaticInterview2 {
  static int value = 33;
  public static void main(String[] args) {
    new StaticInterview2().printValue();;
  }

  private void printValue(){
    int value = 3;
    System.out.println(this.value);
  }
}
