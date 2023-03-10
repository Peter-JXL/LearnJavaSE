package chapter5.section8Enum;
/*
 * 使用enum类的好处
 * 1. 不能使用非枚举变量的值和其他数据类型比较（例如int）
 * 2. 不能引用到非枚举的值
 * 3. 不同类型的枚举不能互相比较或者赋值
 * 
 * 下面给出了3个错误用法，请读者自行尝试编译，并观察错误输出信息。
 * javac LearnEnum2.java -encoding utf8
 */

public class LearnEnum2 {
  public static void main(String[] args) {
    int day = 1;

//    if (day == WeekDay3.SUN){}
//    WeekDay day2 =WeekDay3.fuk;
//    WeekDay3 day3 =Color.RED;
  }
}


enum WeekDay3{
  SUN, MON, TUE, WED, THU, FRI, SAT
}

enum Color {
  RED, GREEN, BULE
}