package chapter20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPDemo1Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("server is running....");
        while (true){
            Socket sock = ss.accept();
            System.out.println("connected from " + sock.getRemoteSocketAddress());
            Thread t = new Handler(sock);
            t.start();
        }
    }
}


class Handler extends Thread{
    Socket sock;

    public Handler(Socket sock){
        this.sock = sock;
    }

    @Override
    public void run() {
        try(InputStream input = this.sock.getInputStream();
            OutputStream output = this.sock.getOutputStream()){
            handle(input, output);
        }catch (Exception e){
            System.out.println("Client disconnected: ");
            e.printStackTrace();
            try{
                this.sock.close();
            }catch (Exception e2){
                System.out.println("sock close error: ");
                e2.printStackTrace();
            }
        }
    }

    private void handle(InputStream input, OutputStream output) throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        writer.write("hello!\n");
        writer.flush();
        while (true){
            String s = reader.readLine();
            if(s.equals("bye, server")){
                writer.write("bye, client!");
                writer.flush();
                break;
            }

            writer.write("server successfully receive message \" " + s + " \" from client. \n");
            writer.flush();
        }
    }
}