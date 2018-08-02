package com.example.helloworld;

//This isn't done.  Just testing interpretations of a quiz question.

public class test2 {
    private static void Interpretation1() {
        int x =0;
        System.out.println("__________Interpretation 1:");
        for(int i = 0; i < 10; i++){
        if (x >= 1) {
            x = x * 2;
                System.out.println(x);}
        else if (x >= 2){
            x = 0;
            System.out.println(x);}
        }
    }
    private static void Interpretation2() {
        int x = 0;
        System.out.println("__________Interpretation 2:");
        for(int i = 0; i < 10; i++) {
            x = i;
            if (x >= 1) {
                x = x * 2;
                System.out.println(x);};
            if (x >= 2){
                x = 0;
                System.out.println(x);}
        }
    }
    public static void main(String[] args) {
        Interpretation1();
        Interpretation2();
    }
}
