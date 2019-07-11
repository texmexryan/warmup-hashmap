package com.ryan.demo;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("Please enter a word");
        String userInput = scanner1.next();
        System.out.println("Please enter a number of times");
        int numberOfTimes = scanner2.nextInt();

        System.out.println(repeating(userInput, numberOfTimes));
    }

    public static String repeating(String userInput, int numberOfTimes){
        String result = "";
        for (int i = 0; i < numberOfTimes; i++){
            result = result + userInput;
        }
        return result;
    }
}