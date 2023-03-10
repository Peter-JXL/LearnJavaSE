package chapter12Hash;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Hash3SHA {
  public static void main(String[] args) throws Exception{
    MessageDigest md = MessageDigest.getInstance("SHA-1");
    md.update("Hello".getBytes("UTF-8"));
    md.update("World".getBytes("UTF-8"));
    byte[] result = md.digest();
    System.out.println(new BigInteger(1, result).toString(16));
    // output: db8ac1c259eb89d4a131b253bacfca5f319d54f2
    
  }
}
