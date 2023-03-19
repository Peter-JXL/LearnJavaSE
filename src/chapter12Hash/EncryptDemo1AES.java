package chapter12Hash;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import java.util.Base64;

public class EncryptDemo1AES {
    public static void main(String[] args) throws Exception {

        // 原文
        String message = "Hello World!";
        System.out.println("message: " + message);

        // 128位密钥 = 16 bytes key
        byte[] key = "1234567890abcdef".getBytes("UTF-8");
        // 加密：
        byte[] data = message.getBytes("UTF-8");
        byte[] encryptedData = encrypt(key, data);
        System.out.println("Encrypted Data: " + Base64.getEncoder().encodeToString(encryptedData));

        // 解密
        byte[] decryptedData = decrypt(key, encryptedData);
        System.out.println("Decrypted Data: " + new String(decryptedData, "UTF-8"));

    }

    // 加密
    public static byte[] encrypt(byte[] key, byte[] input) throws GeneralSecurityException{
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpce = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpce);
        return  cipher.doFinal(input);
    }

    //解密
    public static byte[] decrypt(byte[] key, byte[] input) throws  GeneralSecurityException{
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpce = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpce);
        return  cipher.doFinal(input);
    }
}
