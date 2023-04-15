package chapter20;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TCPDemo2Client {
    public static void main(String[] args) throws IOException{
        Socket sock = new Socket("localhost", 7777);
        try(InputStream input = sock.getInputStream();
            OutputStream output = sock.getOutputStream()){
            handle(input, output);
        }
        sock.close();
        System.out.println("Disconnected from server.");
    }

    private static void handle(InputStream input, OutputStream output) throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        System.out.println("[server] " + reader.readLine());
        while(true) {
            System.out.print(">>> ");
            String s= scanner.nextLine();
            writer.write(s);
            writer.newLine();
            writer.flush();
            String resp = reader.readLine();
            System.out.println("<<< " + resp);
            if(resp.equals("bye, client!")){
                break;
            }
        }
    }
}
