package chapter10Exception;

/**
 * 测试try-catch-finally的return执行情况，finally修改数据，但数据是基本类型时，不生效，返回10
 */
public class LearnExceptionDemo7 {
  public static void main(String[] args) {
    System.out.println(say());
  }
  static int say(){
    int a = 10;
    try{
      return a;
    }catch (Exception e){
      return a;
    }finally {
      a=30;
    }
  }
}
