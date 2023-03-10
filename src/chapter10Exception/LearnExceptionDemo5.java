public class LearnExceptionDemo5 {
  public static void main(String[] args) throws Exception{
    Exception origin = null;
    try {
      Integer.parseInt("abc");
    } catch (Exception e) {
      origin = e;
      throw e;
    }finally {
      Exception e = new IllegalArgumentException();
      if(null != origin){
        e.addSuppressed(origin);
      }
      throw e;
    }
  }
}
