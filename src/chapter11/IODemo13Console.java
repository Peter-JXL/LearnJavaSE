package chapter11;

import java.io.Console;

public class IODemo13Console {
    public static void main(String[] args) {
        Console cnsl = System.console();
        if (cnsl != null) {
            String alpha = cnsl.readLine("Name: ");
            System.out.println("Name is: " + alpha);
            char[] pwd = cnsl.readPassword("Password: ");
            System.out.println("Password is: " + String.valueOf(pwd));
        }else {
            System.out.println("Please run in terminal, not in IDE ");
        }
    }
}
