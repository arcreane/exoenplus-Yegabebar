package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exo3 {
    public static void table(){
        Scanner userInputScanner = new Scanner(System.in);

        String[][] matrix = new String[3][5];
        List<String> tempList = new List<String>();
        for(int i = 0;i<3;i++){
            String[] userInput = new String[4];

            System.out.println("Please enter an array of 5 numbers between 0 and 10: ");
            userInput = userInputScanner.nextLine().split(" ");
            List<String> userInputAsList = Arrays.asList(userInput);

            System.out.println("Warning your array contains a number greater than 10");

            for(int j = 0;j<5;j++){
                matrix[i][j] = userInput[j];
            }


        }
    }
}
