package com.example.helloworld;

public class Methods {
    private static int myAddition(int x, int y) {
        return x + y;
    }
    private static void myAverage(int w,
                                  int x,
                                  int y,
                                  int z) {
        System.out.println("Average result is " + (w + x + y + z)/4);
    }
    private static String myDiscussion() {
        System.out.println("Get ready.");
        String discussion = "We will now present the data...";
        return discussion;
    }
    private static String[] getListOfFruit() {
        String[] fruit = {"apple", "banana", "cherry"};
        return fruit;
    }
    public static void main(String[] args) {
        String discussion1 = myDiscussion();
        System.out.println(discussion1);
        System.out.println();
        System.out.println("Addition result is " + myAddition(5,6));
        myAverage(3,4,6,7);
        String[] fruit1 = getListOfFruit();
        System.out.println("Your Fruits are " + fruit1[0] + ", " + fruit1[1]);
    }
}
