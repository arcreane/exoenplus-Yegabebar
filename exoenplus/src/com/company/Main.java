package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean keepUp = true;
        do{
            Scanner choixExo = new Scanner(System.in);
            System.out.println("1 - Exo1: Guess a number");
            System.out.println("2 - Exo2: Palindrome or not");
            System.out.println("3 - Exo3: Tables");
            System.out.println("4 - Exo4: MineSweeper");
            System.out.println("5 - Quit");

            System.out.println("Choix de l'exercice: ");
            int exo = choixExo.nextInt();

            switch(exo){
                case 1:
                    Exo1.guessANumber();
                    break;
                case 2:
                    Exo2.palindrome();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    keepUp=false;
                    break;

                default:
                    System.out.println("Incorrect entry - try again");


            }
        }while(keepUp!=false);


    }
}
