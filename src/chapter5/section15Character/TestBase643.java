package chapter5.section15Character;

import java.util.Arrays;
import java.util.Base64;

public class TestBase643 {
  public static void main(String[] args) {
    byte[] input = new byte[] { 0x01, 0x02, 0x7f, 0x00};
    String b64encoded = Base64.getUrlEncoder().encodeToString(input);
    System.out.println(b64encoded);

    byte[] output = Base64.getUrlDecoder().decode(b64encoded);
    System.out.println(Arrays.toString(output));
  }
}
