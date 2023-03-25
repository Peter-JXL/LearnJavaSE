package chapter10Exception;

public class ChainedExceptionDemo2 {
  public static void main(String[] args) {
    try {
      method1();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void method1() throws Exception {
    try {
      method2();
    }
    catch (Exception ex) {
      Exception ex2 = new Exception("New info from method1");
      ex2.initCause(ex);
      throw ex2;
    }
  }

  public static void method2() throws Exception {
    throw new Exception("New info from method2");
  }
}
