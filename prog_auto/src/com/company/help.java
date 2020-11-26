package com.company;

public class help {
    void info(char choice) {
        switch (choice) {
            case '1':
                System.out.println("Оператор if:\nif (условие) оператор;\nelse оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\nswitch (выражение) {\n\tcase константа:\n\tпоследовательность операторов;\n\tbreak;\n//...\n}");
                break;
            case '3':
                System.out.println("Оператор for:\nfor (инициализация; условия; итерация)\n оператор");
                break;
            case '4':
                System.out.println("Оператор while:\nwhile (условие) оператор;");
                break;
            case '5':
                System.out.println("Оператор do-while\ndo {\n оператор;\n} while (условие);");
                break;
            case '6':
                System.out.println("Оператор break\nbreak; или break метка;");
                break;
            case '7':
                System.out.println("Оператор continue\ncontinue; или continue метка");
                break;

        }
        System.out.println();
    }

    void menu () {
        System.out.println("Справка:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n6. break\n7. continue\nВыберите (q - выход): ");
    }

    boolean valid (int ch) {
        if (ch < '1' | ch > '7' & ch == 'q') return false;
        else return true;
    }
}
