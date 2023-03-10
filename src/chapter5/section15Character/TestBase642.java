package chapter5.section15Character;
import java.util.Arrays;
import java.util.Base64;

public class TestBase642 {
  public static void main(String[] args) {
    byte[] input = new byte[] { (byte) 0xe4, (byte) 0xb8, (byte) 0xad, 0x21 };
    String b64encoded = Base64.getEncoder().encodeToString(input); 
    String b64encoded2 = Base64.getEncoder().withoutPadding().encodeToString(input);
    System.out.println(b64encoded);  //5LitIQ==
    System.out.println(b64encoded2);  //5LitIQ


    byte[] output = Base64.getDecoder().decode(b64encoded2);  //[-28, -72, -83, 33]
    System.out.println(Arrays.toString(output));
  }
}
