package chapter12Hash;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.math.BigInteger;

public class Hash5HMAC {
    public static void main(String[] args) throws Exception{
        KeyGenerator keygen = KeyGenerator.getInstance("HmacMD5");
        SecretKey key = keygen.generateKey();   //随机生成一个key
        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(key);
        mac.update("HelloWorld".getBytes("UTF-8"));
        byte[] result = mac.doFinal();
        System.out.println(new BigInteger(1, result).toString(16));
    }
}
