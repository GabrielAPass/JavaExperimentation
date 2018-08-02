package com.example.helloworld;

public class SomeStrings {
    public static void main(String[] args) {
        String message1 = "Hello Strings!";
        String message2 = "These are some Strings!";

        System.out.println(message1 + "  " + message2);
        System.out.println(message1.length());
        System.out.println(message2.length());

        System.out.println(message1.substring(0,3));
        System.out.println(message1.substring(5));

        System.out.println(message2.indexOf("These are"));

        // Part 2
        System.out.println("-----SECTION 2-----");
        System.out.println(message1.compareTo("Hello String"));

        // part 3
        System.out.println("-----SECTION 3-----");
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // part 4
        System.out.println("------SECTION 4-----");
        String st1 = "Happy Birthday";
        String st2 = "Jose";
        String result = st1 + " " + st2;
        System.out.println(result);


        // part 5
        System.out.println("-----SECTION 5-----");
        String message3 = "12" + 4 + 3;
        System.out.println(message3);

        String message4 = "12" + (4 + 3);
        System.out.println(message4);

        message4 = "All Done!";
        System.out.println(message4);

        // part 6
        System.out.println("-----SECTION 6-----");
        boolean isOpen = true;
        boolean gotMoney = false;
        boolean CantRefuse = false;
        if ((isOpen && gotMoney) || CantRefuse) System.out.println("Wanna play a game?");
        else System.out.println("We're Closed! Go Home!");
        System.out.println("all done...");
    }
}
