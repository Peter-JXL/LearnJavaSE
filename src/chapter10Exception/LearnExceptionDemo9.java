package chapter10Exception;

/**
 * 测试try-catch-finally的return执行情况
 */
public class LearnExceptionDemo9 {
  public static void main(String[] args) {

    System.out.println("testCase1返回：" + testCase1());  //500
    System.out.println("testCase2返回：" + testCase2());  //200
    System.out.println("testCase3返回：" + testCase3());  //200
    System.out.println("testCase3_2返回：" + testCase3_2().num);  //200

  }

  /*  情况一：如果finally中有return语句，则会将try中的return语句”覆盖“掉，
      直接执行finally中的return语句，得到返回值，这样便无法得到try之前保留好的返回值。
   */
  public static int testCase1(){
    int number = 100;
    try{
      System.out.println("testCase1 try语句块执行中... ");
      number += 100;
      return number;
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      System.out.println("testCase1 finally语句块执行中...");
      number = 500;
      return number;
    }
  }


  /**
   *  情况二：如果finally中没有return语句，也没有改变要返回值，
   *  则执行完finally中的语句后，会接着执行try中的return语句，返回之前保留的值。
   * @return
   */
  public static int testCase2(){
    int number = 100;
    try{
      System.out.println("testCase2 try语句块执行中... ");
      number += 100;
      return number;
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      System.out.println("testCase2 finally语句块执行中...");
    }

    return 10;
  }


  /**
   * 情况三：如果finally中没有return语句，但是改变了要返回的值，并且返回的是基本数据类型，则改变不会生效
   * @return
   */
  public static int testCase3(){
    int number = 100;
    try{
      System.out.println("testCase3 try语句块执行中... ");
      number += 100;
      return number;
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      System.out.println("testCase3 finally语句块执行中...");
      number = 500;

    }

    return 10;
  }


  /**
   * 情况三：如果finally中没有return语句，但是改变了要返回的值，并且返回的是引用数据类型，则改变会生效
   * @return
   */
  public static Num testCase3_2(){
    Num number = new Num();
    try{
      System.out.println("testCase3_2 try语句块执行中... ");
      return number;
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      System.out.println("testCase3_2 finally语句块执行中...");
      number.num = 100;

    }

    return number;
  }

}

class Num{
  public  int num = 1;
}
