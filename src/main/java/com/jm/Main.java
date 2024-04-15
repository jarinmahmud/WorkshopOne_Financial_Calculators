package com.jm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which Calculator would you like to use? (b)asic or (s)cientific?");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if(command.equalsIgnoreCase("b")){
            System.out.println("Run basic calculator");
        } else if(command.equalsIgnoreCase("s")){
            System.out.println("Run scientific calculator");
        } else {
            System.out.println("Command not found");
        }

    }

}