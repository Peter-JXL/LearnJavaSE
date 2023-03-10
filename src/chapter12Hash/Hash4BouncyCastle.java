package chapter12Hash;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Security;

public class Hash4BouncyCastle {
  public static void main(String[] args) throws Exception{
       // 注册BouncyCastle:
       Security.addProvider(new BouncyCastleProvider());
       // 按名称正常调用:
       MessageDigest md = MessageDigest.getInstance("RipeMD160");
       md.update("HelloWorld".getBytes("UTF-8"));
       byte[] result = md.digest();
       System.out.println(new BigInteger(1, result).toString(16));
  }
}
