package chapter5.section4Static;
public class StaticInterview6 {
  public static void main(String[] args) {
    new Out();
  }
}


class Out {

  static int num = 0;
  String name = "aaa";
  static String name2 = "bbb";
  static Out out2 = new Out();

  Out() {
      System.out.println("执行构造函数");
  }
  {
      System.out.println("执行普通代码块，name值："+name);
  }
  static {
      num +=1;
      System.out.println("执行静态代码块，name2值："+name2+"，num值："+num);
  }
}