package com.company;

public class Main {

    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-222"},
                {"Dasha", "111-111"},
                {"Ananas", "232-323"},
                {"Rachel", "666-999"}
        };
        int i;
        if(args.length != 1) //зачем
            System.out.println("using: java phone <name>");
        else {
            for(i=0; i<numbers.length; i++)
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
        }

    }
}
