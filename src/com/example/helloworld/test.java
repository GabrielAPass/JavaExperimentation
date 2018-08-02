package com.example.helloworld;

public class test {
    public static void main(String[] args) {
        int[ ] a = {5,0,7,8,9};
        int temp = 1;
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
            if(a[i] < temp)
            {
                temp = a[i];
            }
        }
    }
}
