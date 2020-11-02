package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exo1 {
    public static void guessANumber(){
            Scanner chosenModeScanner = new Scanner(System.in);
            System.out.println("2 modes available");
            System.out.println("1 - 10 tries before gameover");
            System.out.println("2 - The game lasts until you find the correct number");
            int chosenMode = chosenModeScanner.nextInt();

            Scanner userInputSc = new Scanner(System.in);
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 100);
            int userInput=0;

            if(chosenMode==1){
                if (limitedRetries(userInputSc, randomNumber)) return;
            }else if(chosenMode==2){
                unlimitedRetries(userInputSc, randomNumber);
                return;
            }else{
                System.out.println("Incorrect entry - try again");
            }
    }

    private static void unlimitedRetries(Scanner userInputSc, int randomNumber) {
        int userInput;
        System.out.println("Guess the number with unlimited retries");
        do{
            userInput = userInputSc.nextInt();
            if(userInput< randomNumber){
                System.out.println("Greater");
            }else{
                System.out.println("Smaller");
            }
        }while(userInput!= randomNumber);
        System.out.println("You win!");
        return;
    }

    private static boolean limitedRetries(Scanner userInputSc, int randomNumber) {
        int userInput;
        System.out.println("10 tries before gameover");
        for (int i = 1;i<10;i++) {
            userInput = userInputSc.nextInt();
            if(userInput== randomNumber){
                System.out.println("You win!");
                return true;
            }else if(userInput< randomNumber){
                System.out.println("Greater");
            }else{
                System.out.println("Smaller");
            }
            System.out.println(10-i+" retries remaining");
        }
        return false;
    }
}
