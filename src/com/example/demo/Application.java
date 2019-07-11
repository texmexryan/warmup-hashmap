package com.example.demo;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name, dude (enter quit to end):");
        String s = in.nextLine();

//        int count = 0;

        HashMap<String, Integer> names = new HashMap<String, Integer>();


//        do{
//            System.out.println("Enter a name, dude");
//
//        }

        while(!s.equals("Quit") || !s.equals("quit")){


            if(names.containsKey(s)) {
                int count = names.get(s).intValue();
                count++;


                System.out.println(s + " was added: " + count + " times");

                names.put(s, count);
            }else{
                names.put(s, 1);
            }
            s = in.nextLine();

        }


//        System.out.println("You entered string "+s);


    }
}
