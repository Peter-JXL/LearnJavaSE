package chapter10Exception;

/**
 * 测试try-catch-finally的return执行情况，finally修改数据，但数据是引用时，会生效
 */
public class LearnExceptionDemo8 {
  public static void main(String[] args) {
    Having h = say();
    System.out.println(h.num);
  }
  static Having say(){
    Having having = new Having();
    try{
      return having;
    }catch (Exception e){
      return having;
    }finally {
      having.num=30;
    }
  }
}
class Having{
  int num = 10 ;
}

