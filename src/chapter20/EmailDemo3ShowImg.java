package chapter20;

import jakarta.activation.DataHandler;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.util.ByteArrayDataSource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class EmailDemo3ShowImg {


    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/chapter20/mail.properties"));

        String username = properties.getProperty("mail.smtp.username");
        String password = properties.getProperty("mail.smtp.password");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);
        //设置发送方地址：
        message.setFrom(new InternetAddress("peterjxl@qq.com"));
        //设置接收方地址
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("peterjxl@qq.com"));
        //设置邮件主题
        message.setSubject("Hello", "UTF-8");

        //准备邮件内容
        Multipart multipart = new MimeMultipart();

        // 添加text，也就是邮件正文
        BodyPart textPart = new MimeBodyPart();
        textPart.setContent("<h1>Hello, PeterJXL</h1> <p><img src=\"cid:img01\"></p>", "text/html;charset=utf-8");
        multipart.addBodyPart(textPart);

        //添加图片
        BodyPart imagePart = new MimeBodyPart();
        imagePart.setFileName("fuk.jpg");
        InputStream input = new FileInputStream("src/chapter20/fuk.jpg");
        imagePart.setDataHandler(new DataHandler(new ByteArrayDataSource(input, "image/jpeg")));

        // 与HTML的<img src="cid:img01">关联:
        imagePart.setHeader("Content-ID", "<img01>");
        multipart.addBodyPart(imagePart);
        // 设置邮件内容为multipart:
        message.setContent(multipart);
        Transport.send(message);
    }
}
