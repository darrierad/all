package com.company;

public class Main {

    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore, answer = 'q';

        help me = new help();
        for (; ; ) {
            do {
                me.menu();
                choice = (char) System.in.read();
                me.info(choice);

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (me.valid(choice));

            if (choice == answer) break;

            System.out.println("\n");

        }
    }
}

