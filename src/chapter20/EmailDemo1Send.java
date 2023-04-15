package chapter20;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.io.FileInputStream;
import java.util.Properties;

public class EmailDemo1Send {


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

        //设置邮件正文
        //message.setText("Hi PeterJXL", "UTF-8");
        message.setText("<h1>Hello</h1> <p>Hi, PeterJXL</p>", "UTF-8","html");  //发送HTML邮件
        Transport.send(message);
    }
}
