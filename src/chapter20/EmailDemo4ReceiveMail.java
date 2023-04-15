package chapter20;

import com.sun.mail.imap.IMAPStore;
import com.sun.mail.pop3.POP3Store;
import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.io.FileInputStream;
import java.util.Properties;

public class EmailDemo4ReceiveMail {


    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/chapter20/mail2.properties"));
        String host = properties.getProperty("mail.imap.host");
        String username = properties.getProperty("mail.imap.username");
        String password = properties.getProperty("mail.imap.password");

        URLName url = new URLName("imap", host, 993, "", username, password);
        Session session = Session.getInstance(properties, null);
        session.setDebug(true);
        Store store = new IMAPStore(session, url);
        store.connect();     // 连接服务器，不连接则会报错 jakarta.mail.MessagingException: Not connected

        // 获取收件箱
        Folder folder = store.getFolder("INBOX");

        //以读写方式打开
        folder.open(Folder.READ_WRITE);

        // 打印邮件总数/新邮件数量/未读数量/已删除数量:
        System.out.println("Total messages: " + folder.getMessageCount());
        System.out.println("New messages: " + folder.getNewMessageCount());
        System.out.println("Unread messages: " + folder.getUnreadMessageCount());
        System.out.println("Deleted messages: " + folder.getDeletedMessageCount());

        // 获取每一封邮件:
        Message[] messages = folder.getMessages();
        for (Message message : messages) {
            // 打印每一封邮件:
            printMessage((MimeMessage) message);
        }

        folder.close(true); // 传入true表示删除操作会同步到服务器上（即删除服务器收件箱的邮件）
        store.close();
    }

    static void printMessage(MimeMessage msg) throws Exception {
        // 邮件主题:
        System.out.println("Subject: " + MimeUtility.decodeText(msg.getSubject()));
        // 发件人:
        Address[] froms = msg.getFrom();
        InternetAddress address = (InternetAddress) froms[0];
        String personal = address.getPersonal();
        String from = personal == null ? address.getAddress() : (MimeUtility.decodeText(personal) + " <" + address.getAddress() + ">");
        System.out.println("From: " + from);
        // 继续打印其他信息，例如收件人，正文.........

    }

}
