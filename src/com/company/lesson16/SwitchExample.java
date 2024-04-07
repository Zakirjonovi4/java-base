package com.company.lesson16;

import java.util.Random;

public class SwitchExample {
    public static void run() {
        Random random = new Random();
        int example = random.nextInt(5);

        switch (example){
            case 0:
                System.out.println("This is zero ");
                break;
            case 1:
                System.out.println("This is one ");
                break;
            case 2:
                System.out.println("This is two ");
                break;
            case 3:
                System.out.println("This is three ");
                break;
            default:
                System.out.println("Other digit ");
                break;
        }
    }
}
