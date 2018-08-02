package com.example.helloworld;

public class TheseLoops {
    private static void pointlessWhileLoop() {
        String message = "Have a 1ong and happy 1ife";
        int index = 0;

        // while more letter "1" is s in the message
        while (message.indexOf("1") >= 0)
        {
            index = message.indexOf("1");
            System.out.println(message.substring(0,index));
            message = message.substring(0,index) + "l" + message.substring(index+1);
        }

        System.out.println(message);
    }
    private static void pointlessForLoop() {
        String line1 = " bottles of pop on the wall";
        String line2 = " bottles of pop";
        String line3 = "Take one down and pass it around";

        // loop 5 times (5, 4, 3, 2, 1)
        for (int i = 5; i > 0; i--)
        {
            System.out.println(i + line1);
            System.out.println(i + line2);
            System.out.println(line3);
            System.out.println((i - 1) + line1);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pointlessWhileLoop();
        pointlessForLoop();
    }
}
