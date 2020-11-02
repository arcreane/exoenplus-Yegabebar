package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exo1 {
    public static void guessANumber(){
        Boolean keepUp = true;
        do{
            Scanner chosenModeScanner = new Scanner(System.in);
            System.out.println("2 modes available");
            System.out.println("1 - 10 tries before gameover");
            System.out.println("2 - The game lasts until you find the correct number");
            int chosenMode = chosenModeScanner.nextInt();

            Scanner userInputSc = new Scanner(System.in);
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 100);
            int userInput=0;

            if(chosenMode==1){
                System.out.println("10 tries before gameover");
                for (int i = 1;i<10;i++) {
                    userInput = userInputSc.nextInt();
                    if(userInput==randomNumber){
                        System.out.println("You win!");
                        return;
                    }else if(userInput<randomNumber){
                        System.out.println("More");
                    }else{
                        System.out.println("Less");
                    }
                    System.out.println(10-i+" retries remaining");
                }
            }else if(chosenMode==2){
                System.out.println("Guess the number with unlimited retries");
                do{
                    userInput = userInputSc.nextInt();
                    if(userInput<randomNumber){
                        System.out.println("More");
                    }else{
                        System.out.println("Less");
                    }
                }while(userInput!=randomNumber);
                System.out.println("You win!");
                return;
            }else{
                System.out.println("Incorrect entry - try again");
            }
        }while(keepUp!=false);




    }
}
