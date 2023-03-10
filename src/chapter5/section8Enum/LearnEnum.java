package chapter5.section8Enum;
public class LearnEnum {
  public static void main(String[] args) {
    WeekDay day = WeekDay.SUN;
    if (day == WeekDay.SUN || day == WeekDay.SAT){
      System.out.println("holiday!");
    }else{
      System.out.println("Work day");
    }
  }
}


enum WeekDay{
  SUN, MON, TUE, WED, THU, FRI, SAT
}