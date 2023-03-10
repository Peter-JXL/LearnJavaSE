package chapter5.section15Character;
public class SOHTest {
  public static void main(String[] args) {
    String string1 = "HOW";
    String string2 = "DO";
    String string3 = "YOU";
    String string4 = "DO";
    StringBuffer buffer = new StringBuffer();
    buffer.append(string1).append("\001").append(string2).append("\002").append(string3).append("\003").append(string4);
    System.out.println(buffer);
  }
}


//blog: https://peterjxl.com/literacy/character-encoding-SOH/