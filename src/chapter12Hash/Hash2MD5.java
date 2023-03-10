package chapter12Hash;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Hash2MD5 {
  public static void main(String[] args) throws Exception{
    MessageDigest md = MessageDigest.getInstance("MD5");
    md.update("Hello".getBytes("UTF-8"));
    md.update("World".getBytes("UTF-8"));
    byte[] result = md.digest();
    System.out.println(new BigInteger(1, result).toString(16));
    // output: 68e109f0f40ca72a15e05cc22786f8e6
  }
}
