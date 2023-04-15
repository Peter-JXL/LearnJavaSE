package chapter20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPDemo2Client {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        ds.setSoTimeout(1000);
        ds.connect(InetAddress.getByName("localhost"), 7777);    // 连接指定服务器和端口

        // 发送数据给服务器
        byte[] data = "Hello".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length);
        ds.send(packet);
        System.out.println("Send data \"Hello\" from server.");


        // 接受服务器返回的数据
        byte[] buffer = new byte[1024];
        packet = new DatagramPacket(buffer, buffer.length);
        ds.receive(packet);
        String resp = new String(packet.getData(), packet.getOffset(), packet.getLength());
        System.out.println("Received data \" " + resp + "\" from server.");
        ds.disconnect();
    }
}
