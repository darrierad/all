package com.company;

public class Main {

    public static void main(String[] args) {
        queue bigQ = new queue(100);
        queue smallQ = new queue(4);

        char ch;
        int i;

        System.out.println("использование очереди bigQ для сохранения алфавита ");
        //поместить буквенные символы
        for(i=0; i<26; i++)
            bigQ.Put((char) ('A' + i));
        //извлечь символы и отобразить
        System.out.print("содержимое очереди bigQ: ");
        for(i=0; i<26; i++) { //26 б в ал?
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("использование очереди smallQ для генерации ошибок");
        //исп оч small для ренегации ошибок
        for(i=0; i<5; i++) {
            System.out.print("\nпопытка сохранения " + (char) + ('Z' - i) );
            smallQ.Put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        //доп обращения к оч small
        System.out.print("содержимое очереди smallQ ");
        for(i=0; i<5; i++) {
            ch = smallQ.get();
            if( ch != (char) 0) System.out.print(ch);
        }

    }
}
