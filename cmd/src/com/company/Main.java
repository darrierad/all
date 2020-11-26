package com.company;

public class Main { //++

    public static void main(String[] args) {
        System.out.println("given " + args.length + " args cmd");
        System.out.println("list of args ");
        for (int i = 0; i < args.length; i++)
            System.out.println("args [" + i + "]: " + args[i]);
    }
}
