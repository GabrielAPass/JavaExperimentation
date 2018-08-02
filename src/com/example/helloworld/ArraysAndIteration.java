package com.example.helloworld;

public class ArraysAndIteration {
    public static void main(String[] args) {

        //Initialize array
        int[ ] highScores = {91,92,93,84,65};

        // or declare array...
        String[ ] names = null;
        // then create the array
        names = new String[5];

        // print the initial values at index 0
        System.out.println(highScores[0]);
        System.out.println(names[0]);

        // change the values in the highScores array
        highScores[0] =  99;
        highScores[1] =  98;
        highScores[2] =  98;
        highScores[3] =  88;
        highScores[4] =  68;
        System.out.println(highScores[0]);
        System.out.println("Length:  " + highScores.length);

        // set the values in the names array
        names[0] = "Jamal";
        names[1] = "Emily";
        names[2] = "Destiny";
        names[3] = "Mateo";
        names[4] = "Sofia";
        System.out.println(names[0]);
    }
}
