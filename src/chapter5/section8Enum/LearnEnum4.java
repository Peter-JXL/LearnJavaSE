package chapter5.section8Enum;
public class LearnEnum4 {
  public static void main(String[] args) {
    WeekDay4 day = WeekDay4.SUN;
    if(day.dayValue == 7)
      System.out.println("SunDay!");

  }
}


enum WeekDay4{
  MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);

  public final int dayValue;

  private WeekDay4(int dayValue){
    this.dayValue = dayValue;
  }
}

