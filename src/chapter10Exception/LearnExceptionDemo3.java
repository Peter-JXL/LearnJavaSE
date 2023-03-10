public class LearnExceptionDemo3 {
  public static void main(String[] args) {
    try {
      int[] list = {1,2,3,4,5};
      System.out.println(sum(list));
    } catch (Exception ex) {
      ex.printStackTrace();

      System.out.println("ex.getMessage(): " + ex.getMessage());
      System.out.println("ex.toString(): " + ex.toString());

      StackTraceElement[] traceElements = ex.getStackTrace();
      for (int i = 0; i < traceElements.length; i++) {
        System.out.print("method: " + traceElements[i].getMethodName() + ". ");
        System.out.print("class: " + traceElements[i].getClassName() + ". ");
        System.out.println("LineNumber: " + traceElements[i].getLineNumber() +". ");
      }
    }
  }

  static int sum(int[] list){
    int result = 0;
    for (int i = 0; i <= list.length; i++) {
      result += list[i];
    }
    return result;
  }
}
