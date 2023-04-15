package chapter20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;


public class UDPDemo1Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(7777);   // 监听指定端口
        System.out.println("server is running....");
        while (true){
            // 数据缓冲区
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            //收取一个UDP数据包。收取到的数据存储在buffer中，由packet.getOffset(), packet.getLength()指定起始位置和长度
            ds.receive(packet);
            // 将其按UTF-8编码转换为String
            String s = new String(packet.getData(), packet.getOffset(), packet.getLength(), StandardCharsets.UTF_8);
            System.out.println("Received data \" " + s + " \" from client");


            // 发送数据给客户端
            byte[] data = "ACK".getBytes(StandardCharsets.UTF_8);
            packet.setData(data);
            ds.send(packet);
        }

    }
}
