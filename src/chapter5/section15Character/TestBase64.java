package chapter5.section15Character;
import java.util.Arrays;
import java.util.Base64;

public class TestBase64{
  public static void main(String[] args) {
    byte[] input = new byte[]{ (byte)0xe4, (byte)0xb8, (byte)0xad};
    String base64Encoded = Base64.getEncoder().encodeToString(input);
    System.out.println(base64Encoded);  //5Lit

    byte[] output = Base64.getDecoder().decode("5Lit");
    System.out.println(Arrays.toString(output));  //[-28, -72, -83]
  }
}